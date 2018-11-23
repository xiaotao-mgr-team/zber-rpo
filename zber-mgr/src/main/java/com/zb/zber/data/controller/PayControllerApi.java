package com.zb.zber.data.controller;

import com.zb.zber.common.core.persistence.db.pagination.PaginationOrdersList;
import com.zb.zber.common.utils.DatetimeUtilies;
import com.zb.zber.common.web.comp.ace.ResponseMessage;
import com.zb.zber.data.model.HeOrder;
import com.zb.zber.data.model.Pay;
import com.zb.zber.data.service.IHeOrderService;
import com.zb.zber.data.service.IPayService;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.util.Date;

/**
 * Created by cuixt on 2018/8/2.
 */

@RequestMapping({"/bgr/pay"})
@Controller
public class PayControllerApi {
    private static final Logger logger = LoggerFactory.getLogger(PayControllerApi.class);

    @Autowired
    private IPayService payService;

    @Autowired
    private IHeOrderService heOrderService;

    @RequestMapping(value={"/list"}, produces={"application/json"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    @ResponseBody
    public ResponseMessage listPay(Pay pay, PaginationOrdersList<Pay> page, HttpServletRequest request)
    {
        logger.info("bgr/pay/list");
        page = this.payService.listPay(page, pay);
        return ResponseMessage.success(page);
    }

    @RequestMapping(value={"/add-update"}, produces={"application/json"})
    @ResponseBody
    public ResponseMessage addPayCheck(String startDate, HttpServletRequest request)
    {
        if (StringUtils.isEmpty(startDate)) {
            startDate = DatetimeUtilies.formatDateTime("yyyy-MM-dd", new Date());
        }
        if (StringUtils.isNotEmpty(startDate))
        {
            this.payService.updatePay(startDate);
            PayCheck(startDate);
        }
        return ResponseMessage.success();
    }

    public void PayCheck(String startDate)
    {
        Pay pay = null;

        int total_1 = 0;
        int total_2 = 0;


        int totalPrice_1 = 0;
        int totalPrice_2 = 0;


        int totalFare_1 = 0;
        int totalFare_2 = 0;


        double totalTax_1 = 0.0D;
        double totalTax_2 = 0.0D;
        PaginationOrdersList<HeOrder> page = new PaginationOrdersList();
        page.getPagination().setCurrentPage(1);
        page.getPagination().setPageSize(100);
        try
        {
            page = heOrderService.listHeOrder(page, DatetimeUtilies.parse("yyyy-MM-dd", startDate), null);
//            if ((page != null) && (page.getDatas() != null) && (page.getDatas().size() > 0))
//            {
//                List<HeOrder> orderlist = page.getDatas();
//                for (HeOrder oay : orderlist) {
//                    if ((oay != null) && (!oay.getIsPay().))
//                    {
//                        total_1++;
//
//                        totalPrice_1 += new Double(oay.getSumMoney().doubleValue()).intValue();
//
//                        totalFare_1 += oay.getExpense().intValue();
//                        if (!oay.getIsGetTicket().booleanValue()) {
//                            totalTax_1 += oay.getTickMoney().doubleValue();
//                        }
//                    }
//                    else if (oay != null)
//                    {
//                        total_2++;
//
//                        totalPrice_2 += new Double(oay.getSumMoney().doubleValue()).intValue();
//                        totalFare_2 += oay.getExpense().intValue();
//                        if (!oay.getIsGetTicket().booleanValue()) {
//                            totalTax_2 += oay.getTickMoney().doubleValue();
//                        }
//                    }
//                }
//                if (total_1 > 0)
//                {
//                    pay = new Pay();
//                    pay.setTotal(Integer.valueOf(total_1));
//                    pay.setTotalPrice(Integer.valueOf(totalPrice_1));
//                    pay.setTotalFare(Double.valueOf(totalFare_1));
//                    pay.setTotalTax(Double.valueOf(totalTax_1));
//                    pay.setIsDestion(Boolean.valueOf(false));
//                    pay.setCheckDate(DatetimeUtilies.parse("yyyy-MM-dd", startDate));
//                    this.payService.add(pay);
//                }
//                if (total_2 > 0)
//                {
//                    pay = new Pay();
//                    pay.setTotal(Integer.valueOf(total_2));
//                    pay.setTotalPrice(Integer.valueOf(totalPrice_2));
//                    pay.setTotalFare(Double.valueOf(totalFare_2));
//                    pay.setTotalTax(Double.valueOf(totalTax_2));
//                    pay.setIsDestion(Boolean.valueOf(true));
//                    pay.setCheckDate(DatetimeUtilies.parse("yyyy-MM-dd", startDate));
//                    this.payService.add(pay);
//                }
//            }
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
    }
}
