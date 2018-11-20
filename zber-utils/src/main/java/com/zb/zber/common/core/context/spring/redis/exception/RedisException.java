
/*   
 * @Title: MemcacheException.java 
 * @Package: com.scf.core.context.spring.memcache.exception 
 * @author wubin  
 * @date 2016年8月2日 上午11:17:23 
 * @version 1.3.1 
 */


package com.zb.zber.common.core.context.spring.redis.exception;


import com.zb.zber.common.core.exception.ExCode;
import com.zb.zber.common.core.exception.sys.SystemException;

/**
 * redis 异常
 * @author wubin
 * @date 2016年8月2日 上午11:17:23 
 * @version V1.1.0
 */

public class RedisException extends SystemException {

    
    /** @Fields serialVersionUID: */
        
    private static final long serialVersionUID = 3123363884205879412L;

    
    public RedisException(int code,String message, Throwable cause) {
        super(code,message,cause);
    }
    
    
    
    public RedisException(int code,String message) {
        super(code,message);
    }
    /**
     * 默认redis异常
     * @author wubin
     * @param cause
     * @return
     */
    public static RedisException defaultRedisException(Throwable cause){
        RedisException memcacheException = new RedisException(ExCode.REDIS_001,ExCode.REDIS_001+"",cause);
        return memcacheException;
    }
    
    /**
     * redis未开启异常
     * @author wubin
     * @return
     */
    public static RedisException notOpenException(){
        RedisException memcacheException = new RedisException(ExCode.REDIS_002,"redis未开启");
        return memcacheException;
    }
    

}
