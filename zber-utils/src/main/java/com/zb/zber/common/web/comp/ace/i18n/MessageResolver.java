package com.zb.zber.common.web.comp.ace.i18n;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.RequestContextUtils;

/**
 * Spring MVC 国际化工具类
 *
 * @author  wub
 * @version  [版本号, 2015年6月23日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class MessageResolver
{

    public static String URL_ENCODING = "UTF-8";

    private MessageResolver() {}

    /**
     * 获取当前request环境下的MessageSource
     *
     * @param request
     * @return
     */
    public static MessageSource getMessageSource(HttpServletRequest request) {
        WebApplicationContext context = (WebApplicationContext) request.getAttribute(DispatcherServlet.WEB_APPLICATION_CONTEXT_ATTRIBUTE);
        if (context == null) {
            throw new IllegalStateException("No WebApplicationContext found: not in a DispatcherServlet request?");
        }
        return context;
    }

    /**
     * 获取当前request环境下的Locale
     *
     * @param request
     * @return
     */
    public static Locale getLocale(HttpServletRequest request) {
        return RequestContextUtils.getLocaleResolver(request).resolveLocale(request);
    }

    /**
     * Retrieve the message for the given code
     *
     * @param request
     * @param code code of the message
     * @return
     * @throws NoSuchMessageException
     */
    public static String getMessage(HttpServletRequest request, String code) throws NoSuchMessageException {
        return MessageResolver.getMessage(request, code, new Object[]{});
    }

    /**
     * Retrieve the message for the given code
     *
     * @param request
     * @param code code of the message
     * @param defaultMessage defaultMessage String to return if the lookup fails
     * @return
     */
    public static String getMessage(HttpServletRequest request, String code, String defaultMessage) {
        return MessageResolver.getMessage(request, code, new Object[]{}, defaultMessage);
    }

    /**
     * Retrieve the message for the given code
     *
     * @param request
     * @param code code of the message
     * @param args arguments for the message, or <code>null</code> if none
     * @return
     * @throws NoSuchMessageException
     */
    public static String getMessage(HttpServletRequest request, String code, Object[] args) throws NoSuchMessageException {
        WebApplicationContext context = (WebApplicationContext) request.getAttribute(DispatcherServlet.WEB_APPLICATION_CONTEXT_ATTRIBUTE);
        if (context == null) {
            throw new IllegalStateException("No WebApplicationContext found: not in a DispatcherServlet request?");
        }
        Locale locale = RequestContextUtils.getLocaleResolver(request).resolveLocale(request);
        return context.getMessage(code, args, locale);
    }

    /**
     * Retrieve the message for the given code
     *
     * @param request
     * @param code code of the message
     * @param args arguments for the message, or <code>null</code> if none
     * @param defaultMessage defaultMessage String to return if the lookup fails
     * @return
     */
    public static String getMessage(HttpServletRequest request, String code, Object[] args, String defaultMessage) {
        WebApplicationContext context = (WebApplicationContext) request.getAttribute(DispatcherServlet.WEB_APPLICATION_CONTEXT_ATTRIBUTE);
        if (context == null) {
            throw new IllegalStateException("No WebApplicationContext found: not in a DispatcherServlet request?");
        }
        Locale locale = RequestContextUtils.getLocaleResolver(request).resolveLocale(request);
        return context.getMessage(code, args, defaultMessage, locale);
    }

    // URIEncodingMessage
    private static String encodeURI(String urlMsg) {
        try {
            return URLEncoder.encode(urlMsg, URL_ENCODING);
        } catch (UnsupportedEncodingException e) {
            return "";
        }
    }

    /**
     * Retrieve the URIEncodingMessage for the given code
     *
     * @param request
     * @param code code of the message
     * @return
     * @throws NoSuchMessageException
     */
    public static String getURIEncodingMessage(HttpServletRequest request, String code) throws NoSuchMessageException {
        return encodeURI(MessageResolver.getMessage(request, code, new Object[]{}));
    }

    /**
     * Retrieve the URIEncodingMessage for the given code
     *
     * @param request
     * @param code code of the message
     * @param defaultMessage defaultMessage String to return if the lookup fails
     * @return
     */
    public static String getURIEncodingMessage(HttpServletRequest request, String code, String defaultMessage) {
        return encodeURI(MessageResolver.getMessage(request, code, new Object[]{}, defaultMessage));
    }

    /**
     * Retrieve the URIEncodingMessage for the given code
     *
     * @param request
     * @param code code of the message
     * @param args arguments for the message, or <code>null</code> if none
     * @return
     * @throws NoSuchMessageException
     */
    public static String getURIEncodingMessage(HttpServletRequest request, String code, Object[] args) throws NoSuchMessageException {
        return encodeURI(MessageResolver.getMessage(request, code, args));
    }

    /**
     * Retrieve the URIEncodingMessage for the given code
     *
     * @param request
     * @param code code of the message
     * @param args arguments for the message, or <code>null</code> if none
     * @param defaultMessage defaultMessage String to return if the lookup fails
     * @return
     */
    public static String getURIEncodingMessage(HttpServletRequest request, String code, Object[] args, String defaultMessage) {
        return encodeURI(MessageResolver.getMessage(request, code, args, defaultMessage));
    }
}
