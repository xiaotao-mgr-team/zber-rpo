package com.zb.zber.data.controller;

import com.zb.zber.common.core.exception.BusinessException;
import com.zb.zber.common.utils.ParamCheckUtils;
import com.zb.zber.common.web.comp.ace.ResponseMessage;
import com.zb.zber.common.web.comp.ace.i18n.MessageResolver;
import com.zb.zber.data.model.Intord;
import com.zb.zber.data.service.IIntordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 企业介绍
 * Created by cuixt on 2018/11/5.
 */
@RequestMapping({"introduce"})
@Controller
public class IntordController {

    @Autowired
    private IIntordService intordService;

    @RequestMapping(value = {"/detail"}, produces = {"application/json"}, method = {RequestMethod.GET})
    @ResponseBody
    public ResponseMessage getDetail(String id,HttpServletRequest request, HttpServletResponse response){
        response.addHeader("Access-Control-Allow-Origin", "*");
        Intord intord = intordService.selectById(id);
        return ResponseMessage.success(intord);
    }

    @RequestMapping(value = {"/update"}, produces = {"application/json"}, method = {RequestMethod.POST})
    @ResponseBody
    public ResponseMessage updateById(HttpServletRequest request,@RequestBody Intord intord){
        try {
            ParamCheckUtils.notAllNull(new Object[]{intord.getId()}, new String[]{"ID"});
            intordService.updateById(intord);
            return ResponseMessage.success();
        } catch (BusinessException e) {
            return ResponseMessage.error((String) e.getValue(), MessageResolver.getMessage(request, (String) e.getValue(), e.getPlaceholders()));
        }
    }

}
