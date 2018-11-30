package com.zb.zber.data.controller;

import com.zb.zber.common.core.exception.BusinessException;
import com.zb.zber.common.core.persistence.db.pagination.PaginationOrdersList;
import com.zb.zber.common.utils.ParamCheckUtils;
import com.zb.zber.common.web.comp.ace.ResponseMessage;
import com.zb.zber.common.web.comp.ace.i18n.MessageResolver;
import com.zb.zber.data.model.Owner;
import com.zb.zber.data.service.IOwnerService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by cuixt on 2018/8/2.
 */

@RequestMapping({"/bgr/owner"})
@Controller
public class OwnerControllerApi {

    @Autowired
    private IOwnerService ownerService;

    @RequestMapping(value = {"/list-page"}, produces = {"application/json"}, method = {org.springframework.web.bind.annotation.RequestMethod.GET})
    @ResponseBody
    public ResponseMessage listOwnerPage(Owner owner, PaginationOrdersList<Owner> page, HttpServletRequest request, HttpServletResponse response) {
        response.addHeader("Access-Control-Allow-Origin", "*");
        page = this.ownerService.listOwner(page, owner);
        return ResponseMessage.success(page);
    }

    @RequestMapping(value = {"/list"}, produces = {"application/json"}, method = {org.springframework.web.bind.annotation.RequestMethod.GET})
    @ResponseBody
    public ResponseMessage listOwner(Owner owner, HttpServletRequest request, HttpServletResponse response) {
        response.addHeader("Access-Control-Allow-Origin", "*");
        List<Owner> ownerList = this.ownerService.selectList(owner);
        return ResponseMessage.success(ownerList);
    }

    @RequestMapping(value = {"/add"}, produces = {"application/json"})
    @ResponseBody
    public ResponseMessage addOwner(Owner owner, HttpServletRequest request, HttpServletResponse response) throws BusinessException {
        try {
            response.addHeader("Access-Control-Allow-Origin", "*");
            ParamCheckUtils.notAllNull(new Object[]{owner.getName()}, new String[]{"name"});
            this.ownerService.insert(owner);
            return ResponseMessage.success();
        } catch (BusinessException e) {
            return ResponseMessage.error((String) e.getValue(),
                    MessageResolver.getMessage(request, (String) e.getValue(), e.getPlaceholders()));
        }
    }

    @RequestMapping(value = {"/update"}, produces = {"application/json"})
    @ResponseBody
    public ResponseMessage updateOwner(String id, HttpServletRequest request) {
        if (StringUtils.isNotEmpty(id)) {
            this.ownerService.deleteById(id);
        }
        return ResponseMessage.success();
    }

    @RequestMapping(value = {"/detail"}, produces = {"application/json"}, method = {org.springframework.web.bind.annotation.RequestMethod.GET})
    @ResponseBody
    public ResponseMessage getOwner(String id, HttpServletRequest request) {
        if (StringUtils.isNotEmpty(id)) {
            Owner owner = this.ownerService.selectById(id);
            return ResponseMessage.success(owner);
        }
        return ResponseMessage.success();
    }

    @RequestMapping(value = {"/delete"}, produces = {"application/json"}, method = {org.springframework.web.bind.annotation.RequestMethod.GET})
    @ResponseBody
    public ResponseMessage deleteOwner(String id, HttpServletRequest request, HttpServletResponse response) {
        {
            response.addHeader("Access-Control-Allow-Origin", "*");
            if (StringUtils.isNotEmpty(id)) {
                this.ownerService.deleteById(id);
            }
            return ResponseMessage.success();
        }
    }
}
