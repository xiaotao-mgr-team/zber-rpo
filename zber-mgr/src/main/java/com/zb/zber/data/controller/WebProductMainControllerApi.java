package com.zb.zber.data.controller;

import com.zb.zber.common.core.exception.BusinessException;
import com.zb.zber.common.utils.ParamCheckUtils;
import com.zb.zber.common.web.comp.ace.ResponseMessage;
import com.zb.zber.common.web.comp.ace.i18n.MessageResolver;
import com.zb.zber.data.model.WebProductMain;
import com.zb.zber.data.service.IWebProductMainService;
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
@RequestMapping({"/web/product-main"})
@Controller
public class WebProductMainControllerApi {

    @Autowired
    private IWebProductMainService mainService;

    @RequestMapping(value={"/add"}, produces={"application/json"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
    @ResponseBody
    public ResponseMessage addWebProductMain(WebProductMain entity, HttpServletRequest request, HttpServletResponse response)
    {
        try {
            ParamCheckUtils.notAllNull(new Object[] { entity.getpName(), entity.getpIntroduce(), entity.getpType()},
                    new String[] { "name", "introduce", "type"});
            mainService.insert(entity);
            return ResponseMessage.success();
        }
        catch (BusinessException e) {
            return ResponseMessage.error((String) e.getValue(), MessageResolver.getMessage(request, (String) e.getValue(), e.getPlaceholders()));
        }
    }

    @RequestMapping(value={"/list"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    @ResponseBody
    public ResponseMessage listWebProductMain(WebProductMain entity, HttpServletRequest request){

        List<WebProductMain> webProductMainList = mainService.selectByExample(entity);
        return ResponseMessage.success(webProductMainList);
    }

}
