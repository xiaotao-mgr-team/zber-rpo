package com.zb.zber.common.utils;

import com.zb.zber.common.CommonMessage;
import com.zb.zber.common.core.exception.BusinessException;
import org.springframework.util.StringUtils;

/**
 * Created by cuixt on 2018/8/10.
 */

public class ParamCheckUtils {

    /**
     *      * 判断非空
     *      
     */
    public static void notAllNull(Object[] objects, String[] names) throws BusinessException  {
        for (int i = 0; i < objects.length; i++) {
            Object object = objects[i];
                if (object instanceof String && StringUtils.isEmpty((String) object)) {
                    throw new BusinessException (CommonMessage.COMMON_BUSINESS_PARAM_NULL_ERR, new String[]{names[i]});
                } else if (!(object instanceof String) && object == null) {
                    throw new BusinessException (CommonMessage.COMMON_BUSINESS_PARAM_NULL_ERR, new String[]{names[i]});
                }
        }
    }

    /**
     * 判断参数是否全部为空,若是则抛出异常
     */
    public static void checkNotAllNull(Object[] objects) throws BusinessException {
        if ((objects == null) || (objects.length == 0)) {
            return;
        }

        int num = 0;
        for (int i = 0; i < objects.length; i++) {
            Object object = objects[i];
            if (object instanceof String && StringUtils.isEmpty((String) object)) {
                num++;
            } else if (!(object instanceof String) && object == null) {
                num++;
            }
        }
        if (num == objects.length) {
            throw new BusinessException("判断数据存在为空的情况");
        }
    }

}
