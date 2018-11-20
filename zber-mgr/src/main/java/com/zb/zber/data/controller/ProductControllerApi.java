package com.zb.zber.data.controller;

import com.zb.zber.common.core.exception.BusinessException;
import com.zb.zber.common.web.comp.ace.ResponseMessage;
import com.zb.zber.common.web.comp.ace.i18n.MessageResolver;
import com.zb.zber.data.model.ProductType;
import com.zb.zber.data.service.IProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RequestMapping({"/product"})
@Controller
public class ProductControllerApi {

    private static final Logger logger = LoggerFactory.getLogger(ProductControllerApi.class);
    @Autowired
    private IProductService productService;

    @RequestMapping(value={"/list"}, produces={"application/json"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    @ResponseBody
    public ResponseMessage listProductType(ProductType productType, HttpServletRequest request)
    {
        try
        {
            List<ProductType> productTypeList = productService.listProductByType(productType);

            return ResponseMessage.success(productTypeList);
        }
        catch (BusinessException e)
        {
            logger.warn("api.product.list.error!", e);
            return ResponseMessage.error((String)e.getValue(),
                    MessageResolver.getMessage(request, (String)e.getValue(), e.getPlaceholders()));
        }
    }
}
