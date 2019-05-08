package com.zb.zber.data.controller;

/**
 * Created by cuixt on 2018/8/2.
 */

import com.zb.zber.common.core.exception.BusinessException;
import com.zb.zber.common.utils.EncryptUtils;
import com.zb.zber.common.utils.ParamCheckUtils;
import com.zb.zber.common.web.comp.ace.ResponseMessage;
import com.zb.zber.common.web.comp.ace.i18n.MessageResolver;
import com.zb.zber.data.common.CommonConstant;
import com.zb.zber.data.model.Admin;
import com.zb.zber.data.service.IAdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RequestMapping({"/admin"})
@Controller
public class AdminControllerApi {

    private static final Logger logger = LoggerFactory.getLogger(AdminControllerApi.class);
    @Autowired
    private IAdminService adminService;

    @RequestMapping(value={"/login"}, produces={"application/json"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
    @ResponseBody
    public ResponseMessage adminLogin(Admin admin, HttpServletRequest request, HttpServletResponse response)
    {
        try
        {
            response.addHeader("Access-Control-Allow-Origin", "*");
            ParamCheckUtils.notAllNull(new Object[] { admin.getName(), admin.getPassword() },
                    new String[] { "name", "password" });

            admin = adminService.login(admin);
            request.getSession().setAttribute(CommonConstant.USER, admin);
            if (org.apache.commons.lang.StringUtils.equals("remember",admin.getRemember())) {
                Cookie loginCookie = new Cookie("jyccglpt_login", admin.getName() + "#" + admin.getPassword());
                loginCookie.setMaxAge(3*24*60*60);
                loginCookie.setPath("/");
                response.addCookie(loginCookie);
            }

            return ResponseMessage.success(admin);
        }
        catch (BusinessException e) {
            logger.warn("api.service-user.login. error!", e);
            return ResponseMessage.error((String) e.getValue(), MessageResolver.getMessage(request, (String) e.getValue(), e.getPlaceholders()));
        }
    }

    @RequestMapping(value={"/logout"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    @ResponseBody
    public ResponseMessage adminLogot(HttpServletRequest request, HttpServletResponse response)
    {
        response.addHeader("Access-Control-Allow-Origin", "*");
        request.getSession().invalidate();
        return ResponseMessage.success();
    }

    public static void main(String[] args){
        System.out.println(EncryptUtils.MD5Encode("123456"));
    }
}
