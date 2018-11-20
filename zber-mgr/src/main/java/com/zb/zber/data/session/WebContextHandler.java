package com.zb.zber.data.session;

import com.zb.zber.common.core.context.ContextHolder;
import com.zb.zber.common.core.context.Identity;
import com.zb.zber.common.core.context.IdentityContext;
import com.zb.zber.common.utils.EncodesUtilies;
import com.zb.zber.common.utils.WebUtilies;
import com.zb.zber.common.web.DefaultWebContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 获取当前会话的信息
 * 
 * @date 2016年9月12日 下午12:27:13
 * @version V1.1.0
 */
public class WebContextHandler {

    private static final Logger logger = LoggerFactory.getLogger(WebContextHandler.class);
    private static final String ENCKEY = "this is facade mgr....";
    private static final String SID = "sid";
    private static final String STIME = "stime";
    private static final String SNAME = "userName";

    public static void setSidToCookie(HttpServletResponse response, String sid, String cookiePath)
    {
        WebUtilies.setCookie(response, null, "sid", EncodesUtilies.urlEncode(sid), cookiePath, null);
    }

    public static void setSTimeToCookie(HttpServletResponse response, String stime, String cookiePath)
    {
        WebUtilies.setCookie(response, null, "stime", EncodesUtilies.urlEncode(stime), cookiePath, null);
    }

    public static void setUserNameToCookie(HttpServletResponse response, String userName, String cookiePath)
    {
        WebUtilies.setCookie(response, null, "userName", EncodesUtilies.urlEncode(userName), cookiePath, null);
    }

    private static String getSidFromCookie()
    {
        DefaultWebContext defaultWebContext = (DefaultWebContext)ContextHolder.getIdentityContext();
        HttpServletRequest request = defaultWebContext.getRequest();
        String sid = WebUtilies.getFromCookie(request, "sid");
        if (StringUtils.isEmpty(sid)) {
            return null;
        }
        return EncodesUtilies.urlDecode(sid);
    }

    private static String getUserNameFromCookie()
    {
        DefaultWebContext defaultWebContext = (DefaultWebContext)ContextHolder.getIdentityContext();
        HttpServletRequest request = defaultWebContext.getRequest();
        String sname = WebUtilies.getFromCookie(request, "userName");
        if (StringUtils.isEmpty(sname)) {
            return null;
        }
        return EncodesUtilies.urlDecode(sname);
    }

    private static String getSTimeFromCookie()
    {
        DefaultWebContext defaultWebContext = (DefaultWebContext)ContextHolder.getIdentityContext();
        HttpServletRequest request = defaultWebContext.getRequest();
        String stime = WebUtilies.getFromCookie(request, "stime");
        if (StringUtils.isEmpty(stime)) {
            return null;
        }
        return EncodesUtilies.urlDecode(stime);
    }

    public static void clearSidCookie(HttpServletResponse response)
    {
        WebUtilies.clearCookie(response, null, "sid", "/");
    }

    public static String getCurUserId()
    {
        return getSidFromCookie();
    }

    public static String getCurTime()
    {
        return getSTimeFromCookie();
    }

    public static String getUserName()
    {
        return getUserNameFromCookie();
    }

    public static void setSessionIdentity(Identity identity)
    {
        IdentityContext identityContext = ContextHolder.getIdentityContext();
        identityContext.setIdentity(identity);
    }

    public static Identity getSessionIdentity()
    {
        IdentityContext identityContext = ContextHolder.getIdentityContext();
        return identityContext.getIdentity();
    }
}
