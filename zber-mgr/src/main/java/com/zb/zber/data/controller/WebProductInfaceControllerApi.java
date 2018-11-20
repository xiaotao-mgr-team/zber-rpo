package com.zb.zber.data.controller;

import com.zb.zber.common.core.exception.BusinessException;
import com.zb.zber.common.utils.ParamCheckUtils;
import com.zb.zber.common.web.comp.ace.ResponseMessage;
import com.zb.zber.common.web.comp.ace.i18n.MessageResolver;
import com.zb.zber.data.common.CommonConstant;
import com.zb.zber.data.enums.FileDomainEnum;
import com.zb.zber.data.handler.UrlHandler;
import com.zb.zber.data.model.WebProductInface;
import com.zb.zber.data.service.IWebProductInfaceService;
import org.apache.commons.lang.StringUtils;
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
@RequestMapping({"/web/product-inface"})
@Controller
public class WebProductInfaceControllerApi {
    private static final Logger logger = LoggerFactory.getLogger(WebProductInfaceControllerApi.class);

    @Autowired
    private IWebProductInfaceService webProductInfaceService;

    @RequestMapping(value={"/add"}, produces={"application/json"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
    @ResponseBody
    public ResponseMessage addWebProductInface(WebProductInface entity, HttpServletRequest request, HttpServletResponse response)
    {
        try {
            ParamCheckUtils.notAllNull(new Object[] { entity.getMainId(), entity.getiName(), entity.getiIntroduce() ,entity.getBigP() ,entity.getSmallP()},
                    new String[] { "mainId", "iName", "introduce" ,"bigP" ,"smallP"});

            if (StringUtils.isNotEmpty(entity.getSmallP()))
            {
                String[] imgs = entity.getSmallP().split(",");
                for (String m : imgs) {
                    UrlHandler.copyFile(m, FileDomainEnum.ZBER_PRODUCT.getCode(), CommonConstant.UploadFileType.IMAGE.getCode());
                }
            }
            webProductInfaceService.insert(entity);
            return ResponseMessage.success();
        }
        catch (BusinessException e) {
            return ResponseMessage.error((String) e.getValue(), MessageResolver.getMessage(request, (String) e.getValue(), e.getPlaceholders()));
        }
    }

    @RequestMapping(value={"/list"}, produces={"application/json"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    @ResponseBody
    public ResponseMessage listWebProductInface(WebProductInface entity, HttpServletRequest request){

        List<WebProductInface> webProductList = webProductInfaceService.selectByExample(entity);
        return ResponseMessage.success(webProductList);
    }
}
