package com.zb.zber.data.controller;

import com.zb.zber.common.core.exception.BusinessException;
import com.zb.zber.common.utils.ParamCheckUtils;
import com.zb.zber.common.web.comp.ace.ResponseMessage;
import com.zb.zber.common.web.comp.ace.i18n.MessageResolver;
import com.zb.zber.data.model.WebProduct;
import com.zb.zber.data.service.IWebProjectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by cuixt on 2018/9/28.
 */
@RequestMapping({"/web/product"})
@Controller
public class WebProductControllerApi {
    private static final Logger logger = LoggerFactory.getLogger(WebProductControllerApi.class);

    @Autowired
    private IWebProjectService webProjectService;

    @RequestMapping(value={"/add"}, produces={"application/json"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
    @ResponseBody
    public ResponseMessage addWebProduct(WebProduct entity, HttpServletRequest request, HttpServletResponse response)
    {
        try {
            ParamCheckUtils.notAllNull(new Object[] { entity.getBigP(), entity.getInfaceId(), entity.getpIntro(), entity.getpName() ,entity.getSmallP() },
                    new String[] { "BigP", "InfaceId", "Intro", "SmallP" });
            webProjectService.insert(entity);
            return ResponseMessage.success();
        }
        catch (BusinessException e) {
            logger.warn("api.service-user.login. error!", e);
            return ResponseMessage.error((String) e.getValue(), MessageResolver.getMessage(request, (String) e.getValue(), e.getPlaceholders()));
        }
    }

    @RequestMapping(value={"/list"}, produces={"application/json"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    @ResponseBody
    public ResponseMessage listWebProduct(WebProduct entity, HttpServletRequest request){

        List<WebProduct> webProductList = webProjectService.selectByExample(entity);
        return ResponseMessage.success(webProductList);
    }


}
