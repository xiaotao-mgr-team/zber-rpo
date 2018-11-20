package com.zb.zber.data.controller;

import com.zb.zber.common.core.context.spring.memcache.cleint.MemCachedOperation;
import com.zb.zber.common.core.exception.BusinessException;
import com.zb.zber.common.core.persistence.db.pagination.PaginationOrdersList;
import com.zb.zber.common.utils.ParamCheckUtils;
import com.zb.zber.common.web.comp.ace.ResponseMessage;
import com.zb.zber.common.web.comp.ace.i18n.MessageResolver;
import com.zb.zber.data.model.Express;
import com.zb.zber.data.model.ExpressType;
import com.zb.zber.data.service.IExpressService;
import com.zb.zber.data.service.impl.ExpressTypeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by cuixt on 2018/8/2.
 */

@RequestMapping({"/bgr/express"})
@Controller
public class ExpressControllerApi {

    private static final Logger logger = LoggerFactory.getLogger(ExpressControllerApi.class);
    @Autowired
    private IExpressService expressService;

    @Autowired
    private ExpressTypeService sTypeService;

    @RequestMapping(value={"/type/list"}, produces={"application/json"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    @ResponseBody
    public ResponseMessage listExpressType(ExpressType expressType, PaginationOrdersList<ExpressType> page, HttpServletRequest request)
    {
        page = sTypeService.listExpressType(page, expressType);

        return ResponseMessage.success(page);
    }

    @RequestMapping(value={"/add"}, produces={"application/json"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
    @ResponseBody
    public ResponseMessage addExpress(Express express, HttpServletRequest request)
    {
        try
        {
            ParamCheckUtils.notAllNull(new Object[] { express.getProductId(), express.getDestion(), express.getCompany(), express.getPrice() },
                    new String[] { "ProductId", "Destion", "Company", "Price" });

            express.setProductName((String) MemCachedOperation.get("PRODUCT_UNIT_NAME_" + express.getProductId()));
            express.setDestionName((String)MemCachedOperation.get("AREA_PROVINCE_" + express.getDestion()));
            this.expressService.addExpress(express);

            MemCachedOperation.set(express.getProductId() + "_" + express.getDestion() + "_" + express.getCompany(), express.getPrice(), 86400);

            return ResponseMessage.success();
        }
        catch (BusinessException e)
        {
            logger.warn("api.express.add. error!", e);
            return ResponseMessage.error((String)e.getValue(), MessageResolver.getMessage(request, (String)e.getValue(), e.getPlaceholders()));
        }
    }

    @RequestMapping(value={"/update"}, produces={"application/json"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
    @ResponseBody
    public ResponseMessage updateExpress(Express express, HttpServletRequest request)
    {
        try
        {
            ParamCheckUtils.notAllNull(new Object[] { express.getId(), express.getProductId(), express.getDestion(), express.getCompany(), express.getPrice() },
                    new String[] { "Id", "ProductId", "Destion", "Company", "Price" });

            this.expressService.updateById(express);

            return ResponseMessage.success();
        }
        catch (BusinessException e)
        {
            logger.warn("api.update.login. error!", e);
            return ResponseMessage.error((String)e.getValue(), MessageResolver.getMessage(request, (String)e.getValue(), e.getPlaceholders()));
        }
    }

    @RequestMapping(value={"/list"}, produces={"application/json"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    @ResponseBody
    public ResponseMessage listExpress(PaginationOrdersList<Express> page, Express express, HttpServletRequest request)
    {
        try
        {
            page = this.expressService.listExpress(page, express);

            return ResponseMessage.success(page);
        }
        catch (BusinessException e)
        {
            logger.warn("api.express.list. error!", e);
            return ResponseMessage.error((String)e.getValue(), MessageResolver.getMessage(request, (String)e.getValue(), e.getPlaceholders()));
        }
    }

    @RequestMapping(value={"/detail"}, produces={"application/json"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    @ResponseBody
    public ResponseMessage getExpressDetail(String id, HttpServletRequest request)
    {
        try
        {
            ParamCheckUtils.notAllNull(new Object[] { id }, new String[] { "id" });
            Express express = this.expressService.selectById(id);

            return ResponseMessage.success(express);
        }
        catch (BusinessException e)
        {
            logger.warn("api.express.detail. error!", e);
            return ResponseMessage.error((String)e.getValue(), MessageResolver.getMessage(request, (String)e.getValue(), e.getPlaceholders()));
        }
    }

    @RequestMapping(value={"/delete"}, produces={"application/json"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    @ResponseBody
    public ResponseMessage deleteProduct(String id, HttpServletRequest request)
    {
        try
        {
            ParamCheckUtils.notAllNull(new Object[] { id }, new String[] { "id" });
            this.expressService.deleteById(id);

            return ResponseMessage.success();
        }
        catch (BusinessException e)
        {
            logger.warn("api.express.delete. error!", e);
            return ResponseMessage.error((String)e.getValue(), MessageResolver.getMessage(request, (String)e.getValue(), e.getPlaceholders()));
        }
    }
}
