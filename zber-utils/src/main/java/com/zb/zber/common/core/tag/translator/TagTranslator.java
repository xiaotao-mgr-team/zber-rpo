package com.zb.zber.common.core.tag.translator;


import com.zb.zber.common.core.tag.entity.SubTag;

public interface TagTranslator {
    
   
    /**
     * service返回facade，由facade做tagValue值转换
     * @author jiangxia
     * @param subTag
     */
    void doTranslate(SubTag subTag);
    
    
}
