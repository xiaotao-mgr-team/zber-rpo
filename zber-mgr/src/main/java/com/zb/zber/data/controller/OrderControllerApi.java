package com.zb.zber.data.controller;

import com.google.common.collect.Lists;
import com.whalin.MemCached.MemCachedClient;
import com.zb.zber.common.core.exception.BusinessException;
import com.zb.zber.common.core.persistence.db.pagination.PaginationOrdersList;
import com.zb.zber.common.utils.DatetimeUtilies;
import com.zb.zber.common.utils.ExcelExportUtilies;
import com.zb.zber.common.utils.FileUtilies;
import com.zb.zber.common.utils.ParamCheckUtils;
import com.zb.zber.common.web.comp.ace.ResponseMessage;
import com.zb.zber.common.web.comp.ace.i18n.MessageResolver;
import com.zb.zber.data.common.CommonUtils;
import com.zb.zber.data.model.Customer;
import com.zb.zber.data.model.IsPay;
import com.zb.zber.data.model.Product;
import com.zb.zber.data.service.ICustomerSerive;
import com.zb.zber.data.service.IProductService;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by cuixt on 2018/11/30.
 */
@RequestMapping({"/bgr/customer"})
@Controller
public class OrderControllerApi {
    private static final Logger logger = LoggerFactory.getLogger(OrderControllerApi.class);
    @Autowired
    private ICustomerSerive customerService;

    @Autowired
    private IProductService productService;

    @Autowired
    private MemCachedClient memCachedClient;

    public Customer CustomerFormat(Customer customer) {
        if (customer == null) {
            return null;
        }
        try {
            if (StringUtils.isEmpty(customer.getOrderDateStr())) {
                customer.setOrderDate(new Date());
            } else {
                customer.setOrderDate(DatetimeUtilies.parse("yyyy-MM-dd", customer.getOrderDateStr()));
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if ((customer.getIsGetTicket() == null) || (customer.getIsGetTicket().booleanValue())) {
            customer.setIsGetTicket(Boolean.valueOf(true));
            customer.setTickType("");
            customer.setTickMoney(0D);
            customer.setTickExpense(0D);
        } else {
            try {
                ParamCheckUtils.notAllNull(new Object[]{customer.getTickType(), customer.getTickMoney()},
                        new String[]{"TickType", "TickMoney"});
            } catch (BusinessException e) {
                e.printStackTrace();
            }
            if ("5P".equals(customer.getTickType().toUpperCase()) || customer.getTickType().contains("普")) {
                customer.setTickExpense(Double.valueOf(customer.getTickMoney().intValue() * 0.03D));
            } else {
                customer.setTickExpense(Double.valueOf(customer.getTickMoney().intValue() * 0.09D));
            }
        }
        Product product = productService.selectById(customer.getProduct());
        customer.setUnitPrice(product.getPrice());
        customer.setName(product.getTitle());
        if (customer.getIsPay() == null) {
            customer.setIsPay(Boolean.valueOf(false));
        }

        if (customer.getIsUseModule() != null && !customer.getIsUseModule().booleanValue()) {
            // todo 是否使用运费模板
        }
        Double extendMoney = customer.getExtendMoney() == null?0:customer.getExtendMoney();
        Double totolMoney = customer.getTickExpense().doubleValue(); //初始化成发票的价格
        totolMoney = totolMoney + customer.getExpense().intValue() + extendMoney;  //加运费的价格

        if (customer.getSellPrice() == null) {
            totolMoney = customer.getUnitPrice().intValue() * customer.getNumber().intValue() + totolMoney;
        } else {
            return null;
        }

        if(StringUtils.isNotBlank(customer.getAddress())){
            customer.setDestion(customer.getAddress().substring(0,20));
        }

        customer.setSumMoney(totolMoney);
        return customer;
    }

    @RequestMapping(value = {"/add"}, produces = {"application/json"}, method = {org.springframework.web.bind.annotation.RequestMethod.POST})
    @ResponseBody
    public ResponseMessage addCustomer(Customer customer, HttpServletRequest request, HttpServletResponse response) {
        try {
            response.addHeader("Access-Control-Allow-Origin", "*");
            ParamCheckUtils.notAllNull(new Object[]{customer.getProduct(), customer.getNumber(), customer.getOrderDateStr()},
                    new String[]{"Product", "Number", "OrderDate"});

            this.customerService.addCustomer(CustomerFormat(customer));
            return ResponseMessage.success();
        } catch (BusinessException e) {
            logger.warn("customer.add error!", e);
            return ResponseMessage.error((String) e.getValue(),
                    MessageResolver.getMessage(request, (String) e.getValue(), e.getPlaceholders()));
        }
    }

    /**
     * 批量处理
     *
     * @param address
     * @param dataStr
     * @param request
     * @param response
     * @return
     * @throws ParseException
     */
    @RequestMapping(value = {"/batchadd"}, produces = {"application/json"}, method = {org.springframework.web.bind.annotation.RequestMethod.POST})
    @ResponseBody
    public ResponseMessage batchProduct(String address, String dataStr, HttpServletRequest request, HttpServletResponse response) {
        try {
            // 一个用户订购多个产品
            // address [address,phone][number,productName,remarks][发票类型,金额]
            response.addHeader("Access-Control-Allow-Origin", "*");
            ParamCheckUtils.checkNotAllNull(new Object[]{address});
            int ix = 0;
            List<Customer> customers = Lists.newArrayList();
            String[] splits = address.split("\n");
            for (int i = 0; i < splits.length; i++) {
                Customer customer = new Customer();
                String addressDetail = splits[i];

                String remarks = "";
                if(StringUtils.isBlank(addressDetail)){
                    continue;
                }

                addressDetail = addressDetail.replace("，",",");
                Map<String,String> tipsMaps = CommonUtils.getProductMaps(addressDetail); //获取用户的数据
                if (tipsMaps.size() == 0) {
                    continue;
                }

                String addds = tipsMaps.get("0");
                String tel = CommonUtils.getRemarks(addds);
                String[] products = tipsMaps.get("1").split(",");

                if(products.length>1){
                    remarks = CommonUtils.getRemarks(products[1]);
                }

                String productName = products[1].substring(0,products[1].length()-(StringUtils.isBlank(remarks)?0:remarks.length()));
                String productId = productService.selectByName(productName);
                if(productId == null){
                    logger.info("产品没有匹配成功!");
                    continue;
                }

                String tickType = "";
                Double tickMoney = 0.0D;

                customer.setIsGetTicket(false);
                if(StringUtils.isNotBlank(tipsMaps.get("2"))){
                    String[] tickets = tipsMaps.get("2").split(",");
                    tickType = tickets[0];
                    tickMoney = Double.valueOf(tickets[1]);
                    customer.setIsGetTicket(true);
                    customer.setTickType(CommonUtils.getTicket(tickType));
                    customer.setTickMoney(tickMoney);
                }

                customer.setAddress(addds);
                customer.setTel(StringUtils.isBlank(tel)?"-":tel);
                customer.setIsUseModule(Boolean.valueOf(false));
                customer.setDestion(addds.substring(0,10));
                //产品
                customer.setExpense(0);
                customer.setNumber(Integer.parseInt(products[0].substring(0,1)));
                customer.setProduct(productId);
                customer.setExpressType("0");
                customer.setTickType(CommonUtils.getTicket(tickType));
                customer.setTickMoney(tickMoney);
                customer.setRemarks(remarks);
                customer.setOrderDateStr(dataStr);
                customer.setIx(ix++);
                customers.add(CustomerFormat(customer));
//                this.customerService.addCustomer(customer);
            }

            this.customerService.batchAdd(customers); //批量添加

            return ResponseMessage.success();
        } catch (BusinessException e) {
            return ResponseMessage.error((String) e.getValue(), MessageResolver.getMessage(request, (String) e.getValue(), e.getPlaceholders()));
        }
    }

    @RequestMapping(value = {"/update"}, produces = {"application/json"}, method = {org.springframework.web.bind.annotation.RequestMethod.POST})
    @ResponseBody
    public ResponseMessage updateCustomer(Customer customer, HttpServletRequest request, HttpServletResponse response) {
        try {
            response.addHeader("Access-Control-Allow-Origin", "*");
            ParamCheckUtils.notAllNull(new Object[]{customer.getId(), customer.getAddress(), customer.getProduct()},
                    new String[]{"ID", "Address", "Product"});

            this.customerService.updateById(CustomerFormat(customer));
            return ResponseMessage.success();
        } catch (BusinessException e) {
            logger.warn("api.customer.update. error!", e);
            return ResponseMessage.error((String) e.getValue(), MessageResolver.getMessage(request, (String) e.getValue(), e.getPlaceholders()));
        }
    }

    @RequestMapping(value = {"/list"}, produces = {"application/json"}, method = {org.springframework.web.bind.annotation.RequestMethod.GET})
    @ResponseBody
    public ResponseMessage listCustomer(PaginationOrdersList<Customer> page, String startDate, String endDate, HttpServletRequest request, HttpServletResponse response)
            throws ParseException {
        try {
            response.addHeader("Access-Control-Allow-Origin", "*");
            Date startDt = new Date();
            Date endDt = new Date();
            if (StringUtils.isNotEmpty(startDate)) {
                startDt = DatetimeUtilies.parse("yyyy-MM-dd", startDate);
            } else {
                startDt = null;
            }
            if (StringUtils.isNotEmpty(startDate)) {
                endDt = DatetimeUtilies.parse("yyyy-MM-dd", endDate);
            } else {
                endDt = null;
            }
            page = this.customerService.listCustomer(page, startDt, endDt);
            return ResponseMessage.success(page);
        } catch (BusinessException e) {
            logger.warn("api.customer.list. error!", e);
            return ResponseMessage.error((String) e.getValue(), MessageResolver.getMessage(request, (String) e.getValue(), e.getPlaceholders()));
        }
    }

    @RequestMapping(value = {"/list-payType"}, produces = {"application/json"}, method = {org.springframework.web.bind.annotation.RequestMethod.GET})
    @ResponseBody
    public ResponseMessage listIsDaofu(HttpServletRequest request, HttpServletResponse response) {
        response.addHeader("Access-Control-Allow-Origin", "*");
        IsPay isPay = null;
        List<IsPay> isPaylist = Lists.newArrayList();
        isPay = new IsPay();
        isPay.setId("0");
        isPay.setName("现款");

        isPaylist.add(isPay);
        isPay = new IsPay();
        isPay.setId("1");
        isPay.setName("到付");


        isPaylist.add(isPay);
        return ResponseMessage.success(isPaylist);
    }

    @RequestMapping(value = {"/detail"}, produces = {"application/json"}, method = {org.springframework.web.bind.annotation.RequestMethod.GET})
    @ResponseBody
    public ResponseMessage getCustomerDetail(String id, HttpServletRequest request, HttpServletResponse response) {
        try {
            response.addHeader("Access-Control-Allow-Origin", "*");
            ParamCheckUtils.notAllNull(new Object[]{id}, new String[]{"id"});

            Customer customer = this.customerService.selectById(id);

            return ResponseMessage.success(customer);
        } catch (BusinessException e) {
            logger.warn("api.customer.detail errorss!", e);
            return ResponseMessage.error((String) e.getValue(),
                    MessageResolver.getMessage(request, (String) e.getValue(), e.getPlaceholders()));
        }
    }

    @RequestMapping(value = {"/delete"}, produces = {"application/json"}, method = {org.springframework.web.bind.annotation.RequestMethod.GET})
    @ResponseBody
    public ResponseMessage deleteProduct(String id, HttpServletRequest request, HttpServletResponse response) {
        try {
            response.addHeader("Access-Control-Allow-Origin", "*");
            ParamCheckUtils.notAllNull(new Object[]{id}, new String[]{"id"});
            this.customerService.deleteById(id);

            return ResponseMessage.success();
        } catch (BusinessException e) {
            logger.warn("api.customer.delete. error!", e);
            return ResponseMessage.error((String) e.getValue(), MessageResolver.getMessage(request, (String) e.getValue(), e.getPlaceholders()));
        }
    }

    @RequestMapping(value = {"/export-by-time"}, produces = {"application/json"}, method = {org.springframework.web.bind.annotation.RequestMethod.GET})
    @ResponseBody
    public ResponseMessage exportOrder(String startDate, String endDate, HttpServletRequest request, HttpServletResponse response) {
        try {
            response.addHeader("Access-Control-Allow-Origin", "*");
            response.setContentType("application/vnd.ms-excel");
            String userAgent = request.getHeader("User-Agent");
            response.setHeader("content-disposition", "attachment;filename=" + FileUtilies.getDownloadEncodeFileName("订单表", userAgent) + ".xls");
            OutputStream os = response.getOutputStream();

            Date startDt = new Date();
            Date endDt = new Date();
            if (StringUtils.isNotEmpty(startDate)) {
                startDt = DatetimeUtilies.parse("yyyy-MM-dd", startDate);
            }
            if (StringUtils.isNotEmpty(startDate)) {
                endDt = DatetimeUtilies.parse("yyyy-MM-dd", endDate);
            }
            PaginationOrdersList<Customer> page = new PaginationOrdersList();
            page.getPagination().setCurrentPage(1);
            page.getPagination().setPageSize(1000);
            page = this.customerService.listCustomer(page, startDt, endDt);

            List<ExcelExportUtilies.ExcelHeaderCell> headerCellList = new ArrayList();
            ExcelExportUtilies.ExcelHeaderCell excelHeaderCell = new ExcelExportUtilies.ExcelHeaderCell("序号", ExcelExportUtilies.ExcelDirection.CENTER, null, true, ExcelExportUtilies.ExcelDirection.CENTER);
            headerCellList.add(excelHeaderCell);
            excelHeaderCell = new ExcelExportUtilies.ExcelHeaderCell("订购日期", ExcelExportUtilies.ExcelDirection.CENTER, "orderDateStr", false, ExcelExportUtilies.ExcelDirection.CENTER);
            headerCellList.add(excelHeaderCell);
            excelHeaderCell = new ExcelExportUtilies.ExcelHeaderCell("用户地址", ExcelExportUtilies.ExcelDirection.CENTER, "address", false, ExcelExportUtilies.ExcelDirection.CENTER);
            headerCellList.add(excelHeaderCell);
            excelHeaderCell = new ExcelExportUtilies.ExcelHeaderCell("订购产品", ExcelExportUtilies.ExcelDirection.CENTER, "name", false, ExcelExportUtilies.ExcelDirection.CENTER);
            headerCellList.add(excelHeaderCell);
            excelHeaderCell = new ExcelExportUtilies.ExcelHeaderCell("单价", ExcelExportUtilies.ExcelDirection.CENTER, "unitPrice", false, ExcelExportUtilies.ExcelDirection.CENTER);
            headerCellList.add(excelHeaderCell);
            excelHeaderCell = new ExcelExportUtilies.ExcelHeaderCell("购买数量", ExcelExportUtilies.ExcelDirection.CENTER, "number", false, ExcelExportUtilies.ExcelDirection.CENTER);
            headerCellList.add(excelHeaderCell);
            excelHeaderCell = new ExcelExportUtilies.ExcelHeaderCell("运费", ExcelExportUtilies.ExcelDirection.CENTER, "expense", false, ExcelExportUtilies.ExcelDirection.CENTER);
            headerCellList.add(excelHeaderCell);
            excelHeaderCell = new ExcelExportUtilies.ExcelHeaderCell("是否开具发票", ExcelExportUtilies.ExcelDirection.CENTER, "isGetTicketStr", false, ExcelExportUtilies.ExcelDirection.CENTER);
            headerCellList.add(excelHeaderCell);
            excelHeaderCell = new ExcelExportUtilies.ExcelHeaderCell("发票类型", ExcelExportUtilies.ExcelDirection.CENTER, "tickType", false, ExcelExportUtilies.ExcelDirection.CENTER);
            headerCellList.add(excelHeaderCell);
            excelHeaderCell = new ExcelExportUtilies.ExcelHeaderCell("发票费用", ExcelExportUtilies.ExcelDirection.CENTER, "tickExpense", false, ExcelExportUtilies.ExcelDirection.CENTER);
            headerCellList.add(excelHeaderCell);
            excelHeaderCell = new ExcelExportUtilies.ExcelHeaderCell("总费用", ExcelExportUtilies.ExcelDirection.CENTER, "sumMoney", false, ExcelExportUtilies.ExcelDirection.CENTER);
            headerCellList.add(excelHeaderCell);
            excelHeaderCell.setFormatDate("yyyy-MM-dd");
            List<Customer> lists = page.getDatas();
            if (!CollectionUtils.isEmpty(lists)) {
//                for (Customer c : lists) {
//                    c.setAddress(c.getDestion());
//                }
                ExcelExportUtilies.export(startDt, endDt, "订单结算表", os, lists, headerCellList);
            }
            return ResponseMessage.success();
        } catch (BusinessException e) {
            return ResponseMessage.error((String) e.getValue(), MessageResolver.getMessage(request, (String) e.getValue(), e.getPlaceholders()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
