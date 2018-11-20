package com.zb.zber.data.controller;

import com.zb.zber.common.core.exception.BusinessException;
import com.zb.zber.common.core.persistence.db.pagination.PaginationOrdersList;
import com.zb.zber.common.utils.ParamCheckUtils;
import com.zb.zber.common.web.comp.ace.ResponseMessage;
import com.zb.zber.common.web.comp.ace.i18n.MessageResolver;
import com.zb.zber.data.model.HeOrder;
import com.zb.zber.data.service.IHeOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by cuixt on 2018/8/2.
 */

@RequestMapping({"/he-order"})
@Controller
public class HeOrderControllerApi {

    private static final Logger logger = LoggerFactory.getLogger(HeOrderControllerApi.class);
    @Autowired
    private IHeOrderService heOrderService;

    @RequestMapping(value = {"/add"}, produces = {"application/json"}, method = {org.springframework.web.bind.annotation.RequestMethod.POST})
    @ResponseBody
    public ResponseMessage addHeOrder(@RequestBody HeOrder heOrder, HttpServletRequest request) {
        try {
            ParamCheckUtils.notAllNull(new Object[]{heOrder.getAddress(), heOrder.getExpressType(),
                            heOrder.getIsGetTicket(), heOrder.getIsPay(), heOrder.getNumber(), heOrder.getProduct()},
                    new String[]{"Address", "ExpressType", "IsGetTicket", "IsPay", "Number", "Product"});
            if ("0".equals(heOrder.getIsGetTicket())) {
                ParamCheckUtils.notAllNull(new Object[]{heOrder.getTickType(), heOrder.getTickMoney()},
                        new String[]{"TickType", "TickMoney"});
            }
            this.heOrderService.insert(heOrder);

            return ResponseMessage.success();
        } catch (BusinessException e) {
            logger.warn("api.order.add. error!", e);
            return ResponseMessage.error((String) e.getValue(), MessageResolver.getMessage(request, (String) e.getValue(), e.getPlaceholders()));
        }
    }

    @RequestMapping(value = {"/delete"}, produces = {"application/json"}, method = {org.springframework.web.bind.annotation.RequestMethod.POST})
    @ResponseBody
    public ResponseMessage delete(@ModelAttribute String id, HttpServletRequest request) {
        try {
            ParamCheckUtils.notAllNull(new Object[]{id}, new String[]{"id"});
            this.heOrderService.deleteById(id);
            return ResponseMessage.success();
        } catch (BusinessException e) {
            logger.warn("api.order.delete. error!", e);
            return ResponseMessage.error((String) e.getValue(), MessageResolver.getMessage(request, (String) e.getValue(), e.getPlaceholders()));
        }
    }

    @RequestMapping(value = {"/update"}, produces = {"application/json"}, method = {org.springframework.web.bind.annotation.RequestMethod.POST})
    @ResponseBody
    public ResponseMessage updateExpress(@RequestBody HeOrder heOrder, HttpServletRequest request) {
        try {
            ParamCheckUtils.notAllNull(new Object[]{heOrder.getId()}, new String[]{"Id"});

            this.heOrderService.update(heOrder);

            return ResponseMessage.success();
        } catch (BusinessException e) {
            logger.warn("api.order.update. error!", e);
            return ResponseMessage.error((String) e.getValue(), MessageResolver.getMessage(request, (String) e.getValue(), e.getPlaceholders()));
        }
    }

    @RequestMapping(value = {"/list"}, produces = {"application/json"}, method = {org.springframework.web.bind.annotation.RequestMethod.GET})
    @ResponseBody
    public ResponseMessage listHeOrder(PaginationOrdersList<HeOrder> page, HeOrder heOrder, HttpServletRequest request) {
        page = this.heOrderService.selectList(page, heOrder);
        return ResponseMessage.success(page);
    }

    @RequestMapping(value = {"/detail"}, produces = {"application/json"}, method = {org.springframework.web.bind.annotation.RequestMethod.GET})
    @ResponseBody
    public ResponseMessage getDetail(@ModelAttribute String id, HttpServletRequest request) {
        try {
            ParamCheckUtils.notAllNull(new Object[]{id}, new String[]{"id"});
            HeOrder heOrder = this.heOrderService.selectById(id);

            return ResponseMessage.success(heOrder);
        } catch (BusinessException e) {
            logger.warn("api.express.detail. error!", e);
            return ResponseMessage.error((String) e.getValue(), MessageResolver.getMessage(request, (String) e.getValue(), e.getPlaceholders()));
        }
    }
}
