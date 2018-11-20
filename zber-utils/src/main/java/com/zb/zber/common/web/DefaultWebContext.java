/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zb.zber.common.web;

import com.zb.zber.common.core.context.Identity;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.ServletWebRequest;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @date 2016年7月27日 下午4:47:05
 * @version V1.1.0
 */
public class DefaultWebContext extends WebContext {

    @Override
    protected HttpSession getSession() {
    	HttpSession httpSession = null;
    	if(getHttpServletRequest()!=null){
    		httpSession = getHttpServletRequest().getSession();
    	}
        return httpSession;
    }

    @Override
    protected HttpServletRequest getHttpServletRequest() {
    	HttpServletRequest  httpServletRequest = null;
    	ServletRequestAttributes servletRequestAttributes = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes());
    	if(servletRequestAttributes!=null){
    		httpServletRequest = servletRequestAttributes.getRequest();
    	}
        return httpServletRequest;
    }

    @Override
    protected HttpServletResponse getHttpServletResponse() {
        ServletWebRequest servletWebRequest = new ServletWebRequest(getHttpServletRequest());
        HttpServletResponse response = servletWebRequest.getResponse();
        return response;
    }

    @Override
    protected ServletContext getServletContext() {
        return getSession().getServletContext();
    }

    @Override
    public Identity getIdentity() {
        Identity identity = null;
        if(this.getSession()!=null){
            identity = (Identity) this.getSession().getAttribute(SESSION_IDENTITY);
        }
        return identity;
    }

    @Override
    public void setIdentity(Identity identity) {
        if(this.getSession() != null){
             this.getSession().setAttribute(SESSION_IDENTITY, identity);
        }else{
        }
    }
    
    public HttpServletRequest getRequest(){
        return this.getHttpServletRequest();
    }

	@Override
	public void destorySession() {
		if(this.getSession() != null){
            this.getSession().invalidate();
       }
	}

}
