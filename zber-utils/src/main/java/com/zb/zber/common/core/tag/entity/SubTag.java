package com.zb.zber.common.core.tag.entity;


import com.zb.zber.common.core.persistence.entity.EntityObject;

/**
 * po中用于横向扩展的额外标签对象
 * @author jiangxia
 * @date 2016年12月28日 下午2:35:15 
 * @version V1.1.0
 */
public class SubTag extends EntityObject {
    
    
    
    /** @Fields serialVersionUID: */
      	
    private static final long serialVersionUID = -236062651376728651L;
    
    private String foreignId;  // 外键id  foreign
    private String tagId;      //标签id 
    private String tagValue;   //标签值
    
    //额外属性
    private Object realValue;  //标签真实值
    public String getTagId() {
        return tagId;
    }
    public void setTagId(String tagId) {
        this.tagId = tagId;
    }
    public String getTagValue() {
        return tagValue;
    }
    public void setTagValue(String tagValue) {
        this.tagValue = tagValue;
    }
    public Object getRealValue() {
        return realValue;
    }
    public void setRealValue(Object realValue) {
        this.realValue = realValue;
    }
    public String getForeignId() {
        return foreignId;
    }
    public void setForeignId(String foreignId) {
        this.foreignId = foreignId;
    }

}

