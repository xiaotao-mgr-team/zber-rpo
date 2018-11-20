package com.zb.zber.data.controller;

import com.zb.zber.common.core.context.spring.memcache.cleint.MemCachedOperation;
import com.zb.zber.common.core.exception.BusinessException;
import com.zb.zber.common.core.persistence.db.pagination.PaginationOrdersList;
import com.zb.zber.common.utils.DatetimeUtilies;
import com.zb.zber.common.utils.ExcelExportUtilies;
import com.zb.zber.common.utils.FileUtilies;
import com.zb.zber.common.utils.ParamCheckUtils;
import com.zb.zber.common.web.comp.ace.ResponseMessage;
import com.zb.zber.common.web.comp.ace.i18n.MessageResolver;
import com.zb.zber.data.model.Customer;
import com.zb.zber.data.model.Express;
import com.zb.zber.data.model.IsPay;
import com.zb.zber.data.service.ICustomerSerive;
import com.zb.zber.data.service.IExpressService;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RequestMapping({"/bgr/customer"})
@Controller
public class CustomerControllerApi {

    private static final Logger logger = LoggerFactory.getLogger(CustomerControllerApi.class);
    @Autowired
    private ICustomerSerive customerService;
    @Autowired
    private IExpressService expressService;

    public Customer CustomerFormat(Customer customer) {

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
            customer.setTickMoney(null);
        } else {
            try {
                ParamCheckUtils.notAllNull(new Object[]{customer.getTickType(), customer.getSellPrice()},
                        new String[]{"TickType", "SellPrice"});
            } catch (BusinessException e) {
                e.printStackTrace();
            }
            if ("5P".equals(customer.getTickType().toUpperCase())) {
                customer.setTickMoney(Double.valueOf(customer.getSellPrice().intValue() * 0.05D));
            } else {
                customer.setTickMoney(Double.valueOf(customer.getSellPrice().intValue() * 0.1D));
            }
        }
        customer.setUnitPrice(Integer.valueOf(Integer.parseInt(String.valueOf(MemCachedOperation.get("PRODUCT_UNIT_PRICE_" + customer.getProduct())))));
        if (customer.getIsPay() == null) {
            customer.setIsPay(Boolean.valueOf(false));
        }
        if (!customer.getIsUseModule().booleanValue()) {
            if ("34d83e73-5a42-4fc7-a55b-3a087071eeca".equals(customer.getProduct())) {
                customer.setExpense(Integer.valueOf(10));
            } else {
                String price = String.valueOf(MemCachedOperation.get(customer.getProduct() + "_" + customer.getDestion() + "_" + customer.getExpressType()));
                if ((!StringUtils.isEmpty(price)) && (!"null".equals(price))) {
                    customer.setExpense(Integer.valueOf(Integer.parseInt(price)));
                } else {
                    Express express = new Express();
                    express.setCompany(customer.getExpressType());
                    express.setDestion(customer.getDestion());
                    express.setProductId(customer.getProduct());

                    PaginationOrdersList<Express> page = new PaginationOrdersList();
                    page.getPagination().setCurrentPage(1);
                    page.getPagination().setPageSize(100);
                    try {
                        page = this.expressService.listExpress(page, express);
                    } catch (BusinessException e) {
                        e.printStackTrace();
                    }
                    if ((page != null) && (page.getDatas().size() > 0)) {
                        customer.setExpense(((Express) page.getDatas().get(0)).getPrice());
                    } else {
                        customer.setExpense(Integer.valueOf(0));
                    }
                }
            }
        }
        return customer;
    }

    @RequestMapping(value = {"/add"}, produces = {"application/json"}, method = {org.springframework.web.bind.annotation.RequestMethod.POST})
    @ResponseBody
    public ResponseMessage addCustomer(Customer customer, HttpServletRequest request, HttpServletResponse response) {
        try {
            ParamCheckUtils.notAllNull(new Object[]{customer.getProduct(), customer.getNumber(), customer.getExpense(), customer.getOwner()},
                    new String[]{"Product", "Number", "Expense", "Owner"});
            response.addHeader("Access-Control-Allow-Origin", "*");
            customerService.addCustomer(CustomerFormat(customer));
            return ResponseMessage.success();
        } catch (BusinessException e) {
            logger.warn("customer.add error!", e);
            return ResponseMessage.error((String) e.getValue(),
                    MessageResolver.getMessage(request, (String) e.getValue(), e.getPlaceholders()));
        }
    }

    @RequestMapping(value = {"/batchadd"}, produces = {"application/json"}, method = {org.springframework.web.bind.annotation.RequestMethod.POST})
    @ResponseBody
    public ResponseMessage batchProduct(String address, String productId, String dataStr, HttpServletRequest request, HttpServletResponse response)
            throws ParseException {
        try {
            ParamCheckUtils.checkNotAllNull(new Object[]{address, productId});
            response.addHeader("Access-Control-Allow-Origin", "*");
            String[] splits = address.split("\n");
            for (int i = 0; i < splits.length; i++) {
                Customer customer = new Customer();
                customer.setAddress(splits[i]);
                customer.setSellPrice((Integer) MemCachedOperation.get("PRODUCT_UNIT_PRICE_" + productId));
                customer.setProduct(productId);
                customer.setIsUseModule(Boolean.valueOf(false));
                customer.setDestion("23");
                customer.setExpense(Integer.valueOf(10));
                customer.setNumber(Integer.valueOf(1));
                customer.setExpressType("3");
                if (StringUtils.isNotEmpty(dataStr)) {
                    customer.setOrderDate(DatetimeUtilies.parse("yyyy-MM-dd", dataStr));
                    customer.setOrderDateStr(dataStr);
                } else {
                    customer.setOrderDateStr(dataStr);
                    customer.setOrderDate(new Date());
                }
                this.customerService.addCustomer(CustomerFormat(customer));
            }
            return ResponseMessage.success();
        } catch (BusinessException e) {
            return ResponseMessage.error((String) e.getValue(), MessageResolver.getMessage(request, (String) e.getValue(), e.getPlaceholders()));
        }
    }

    @RequestMapping(value = {"/update"}, produces = {"application/json"}, method = {org.springframework.web.bind.annotation.RequestMethod.POST})
    @ResponseBody
    public ResponseMessage updateCustomer(Customer customer, HttpServletRequest request, HttpServletResponse response){
        try {
            ParamCheckUtils.notAllNull(new Object[]{customer.getId(), customer.getAddress(), customer.getProduct()},
                    new String[]{"ID", "Address", "Product"});
            response.addHeader("Access-Control-Allow-Origin", "*");
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
            Date startDt = new Date();
            Date endDt = new Date();
            response.addHeader("Access-Control-Allow-Origin", "*");
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
    public ResponseMessage listIsDaofu(HttpServletRequest request, HttpServletResponse response){
        IsPay isPay = null;
        response.addHeader("Access-Control-Allow-Origin", "*");
        List<IsPay> isPaylist = new ArrayList<>();
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
    public ResponseMessage getCustomerDetail(String id, HttpServletRequest request, HttpServletResponse response){
        try {
            ParamCheckUtils.notAllNull(new Object[]{id}, new String[]{"id"});
            response.addHeader("Access-Control-Allow-Origin", "*");
            Customer customer = this.customerService.selectById(id);

            return ResponseMessage.success(customer);
        } catch (BusinessException e) {
            logger.warn("api.customer.detail error!", e);
            return ResponseMessage.error((String) e.getValue(),
                    MessageResolver.getMessage(request, (String) e.getValue(), e.getPlaceholders()));
        }
    }

    @RequestMapping(value = {"/delete"}, produces = {"application/json"}, method = {org.springframework.web.bind.annotation.RequestMethod.GET})
    @ResponseBody
    public ResponseMessage deleteProduct(String id, HttpServletRequest request, HttpServletResponse response){
        try {
            ParamCheckUtils.notAllNull(new Object[]{id}, new String[]{"id"});
            response.addHeader("Access-Control-Allow-Origin", "*");
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
            response.setContentType("application/vnd.ms-excel");
            response.addHeader("Access-Control-Allow-Origin", "*");
            String userAgent = request.getHeader("User-Agent");
            response.setHeader("content-disposition", "attachment;filename=" + FileUtilies.getDownloadEncodeFileName("订单表", userAgent) + ".xls");
            OutputStream os = response.getOutputStream();

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
            PaginationOrdersList<Customer> page = new PaginationOrdersList();
            page.getPagination().setCurrentPage(1);
            page.getPagination().setPageSize(1000);
            page = this.customerService.listCustomer(page, startDt, endDt);

            List<ExcelExportUtilies.ExcelHeaderCell> headerCellList = new ArrayList();
            ExcelExportUtilies.ExcelHeaderCell excelHeaderCell = new ExcelExportUtilies.ExcelHeaderCell("序号", ExcelExportUtilies.ExcelDirection.CENTER, null, true, ExcelExportUtilies.ExcelDirection.CENTER);
            headerCellList.add(excelHeaderCell);
            excelHeaderCell = new ExcelExportUtilies.ExcelHeaderCell("用户地址", ExcelExportUtilies.ExcelDirection.CENTER, "address", false, ExcelExportUtilies.ExcelDirection.CENTER);
            headerCellList.add(excelHeaderCell);
            excelHeaderCell = new ExcelExportUtilies.ExcelHeaderCell("订购产品", ExcelExportUtilies.ExcelDirection.CENTER, "productName", false, ExcelExportUtilies.ExcelDirection.CENTER);
            headerCellList.add(excelHeaderCell);
            excelHeaderCell = new ExcelExportUtilies.ExcelHeaderCell("单价", ExcelExportUtilies.ExcelDirection.CENTER, "unitPrice", false, ExcelExportUtilies.ExcelDirection.CENTER);
            headerCellList.add(excelHeaderCell);
            excelHeaderCell = new ExcelExportUtilies.ExcelHeaderCell("购买数量", ExcelExportUtilies.ExcelDirection.CENTER, "number", false, ExcelExportUtilies.ExcelDirection.CENTER);
            headerCellList.add(excelHeaderCell);
            excelHeaderCell = new ExcelExportUtilies.ExcelHeaderCell("快递", ExcelExportUtilies.ExcelDirection.CENTER, "expressName", false, ExcelExportUtilies.ExcelDirection.CENTER);
            headerCellList.add(excelHeaderCell);
            excelHeaderCell = new ExcelExportUtilies.ExcelHeaderCell("运费", ExcelExportUtilies.ExcelDirection.CENTER, "expense", false, ExcelExportUtilies.ExcelDirection.CENTER);
            headerCellList.add(excelHeaderCell);
            excelHeaderCell = new ExcelExportUtilies.ExcelHeaderCell("是否开具发票", ExcelExportUtilies.ExcelDirection.CENTER, "isGetTicketStr", false, ExcelExportUtilies.ExcelDirection.CENTER);
            headerCellList.add(excelHeaderCell);
            excelHeaderCell = new ExcelExportUtilies.ExcelHeaderCell("发票类型", ExcelExportUtilies.ExcelDirection.CENTER, "tickType", false, ExcelExportUtilies.ExcelDirection.CENTER);
            headerCellList.add(excelHeaderCell);
            excelHeaderCell = new ExcelExportUtilies.ExcelHeaderCell("发票费用", ExcelExportUtilies.ExcelDirection.CENTER, "tickMoney", false, ExcelExportUtilies.ExcelDirection.CENTER);
            headerCellList.add(excelHeaderCell);
            excelHeaderCell = new ExcelExportUtilies.ExcelHeaderCell("总费用", ExcelExportUtilies.ExcelDirection.CENTER, "sumMoney", false, ExcelExportUtilies.ExcelDirection.CENTER);
            headerCellList.add(excelHeaderCell);
            excelHeaderCell = new ExcelExportUtilies.ExcelHeaderCell("是否到付", ExcelExportUtilies.ExcelDirection.CENTER, "isPayStr", false, ExcelExportUtilies.ExcelDirection.CENTER);
            headerCellList.add(excelHeaderCell);
            excelHeaderCell = new ExcelExportUtilies.ExcelHeaderCell("订购日期", ExcelExportUtilies.ExcelDirection.CENTER, "orderDate", false, ExcelExportUtilies.ExcelDirection.CENTER);
            headerCellList.add(excelHeaderCell);
            excelHeaderCell.setFormatDate("yyyy-MM-dd");
            if (!CollectionUtils.isEmpty(page.getDatas())) {
                ExcelExportUtilies.export(startDt, endDt, "订单表", os, page.getDatas(), headerCellList);
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
