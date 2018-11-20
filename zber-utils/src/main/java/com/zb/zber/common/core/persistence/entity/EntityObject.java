/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zb.zber.common.core.persistence.entity;

import com.google.common.collect.Lists;
import com.zb.zber.common.core.constant.CommonConstants;
import com.zb.zber.common.core.tag.entity.ExtendedObject;
import com.zb.zber.common.utils.DatetimeUtilies;
import com.zb.zber.common.utils.UUIDUtilies;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.util.StringUtils;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * 系统基础字段，不参与业务
 * 
 */
@MappedSuperclass
public class EntityObject extends ExtendedObject implements IEntity, Serializable {

    private static final long serialVersionUID = -6608161539956139632L;
    @org.mongodb.morphia.annotations.Id
    @org.mongodb.morphia.annotations.Property("id")
    private String id;
    // @org.mongodb.morphia.annotations.Version
    // private long version;
    @org.mongodb.morphia.annotations.Transient
    private int delf;
    @org.mongodb.morphia.annotations.Transient
    private String createUserId;
    @org.mongodb.morphia.annotations.Transient
    @DateTimeFormat(pattern= DatetimeUtilies.DATE_TIME)
    private Date createTime;
    @org.mongodb.morphia.annotations.Transient
    private String modifyUserId;
    @org.mongodb.morphia.annotations.Transient
    @DateTimeFormat(pattern=DatetimeUtilies.DATE_TIME)
    private Date modifyTime;
    @org.mongodb.morphia.annotations.Transient
    private String remark;

    /**
     * @return the id
     */
    @Id
    // @GeneratedValue(generator = "system-uuid")
    // @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @GenericGenerator(name = "suGenerator", strategy = "com.scf.core.persistence.db.dao.hibernate.ShortUUIDGenerator")
    @GeneratedValue(generator = "suGenerator")
    @Column(name = "id", length = 32, unique = true, nullable = false)
    @Override
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    // /**
    // *
    // * @return
    // */
    // @Version
    // @Column
    // public long getVersion() {
    // return version;
    // }
    //
    // /**
    // * @param version the id to set
    // */
    // private void setVersion(long version) {
    // this.version = version;
    // }

    /**
     * @return the delf
     */
    @Column(name = "delete_flag")
    public int getDelf() {
        return delf;
    }

    public void setDelf(int delf) {
        this.delf = delf;
    }

    @Column(name = "create_user_id")
    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    @Column(name = "create_time")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Column(name = "modify_user_id")
    public String getModifyUserId() {
        return modifyUserId;
    }

    public void setModifyUserId(String modifyUserId) {
        this.modifyUserId = modifyUserId;
    }

    @Column(name = "modify_time")
    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * @return remark
     */

    public String getRemark() {
        return remark;
    }

    /**
     * @param remark 设置 remark
     */

    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 创建新对象时，设置uid,及delete flag
     *
     */
    @PrePersist
    protected void prePersist() {
        if (id == null) {
            String uuid = UUIDUtilies.uuid();
            this.id = uuid;
        }
        this.delf = CommonConstants.FLAG_UNDELETE;
    }
    
    public void preInsert(String createUserId) {
        
        if (id == null) {
            String uuid = UUIDUtilies.uuid();
            this.id = uuid;
        }
        this.delf = CommonConstants.FLAG_UNDELETE;
        this.createTime = new Date();
        
        
        if(!StringUtils.isEmpty(createUserId)){
            this.createUserId = createUserId;
        }else{
            this.createUserId = CommonConstants.DEFAULT_OPER_USER_ID;
        }
    }
    
    /**
     * 预插入初始化基本信息
     * @author wubin
     */
    public void preInsert() {
        preInsert(null);
    }
    
    
    public void preUpdate(String modifyUserId) {
        
        this.modifyTime = new Date();
        
        if(!StringUtils.isEmpty(modifyUserId)){
            this.modifyUserId = modifyUserId;
        }else{
            this.modifyUserId = CommonConstants.DEFAULT_OPER_USER_ID;
        }
    }
    
    
    /**
     * 预更新初始化基本信息
     * @author wubin
     */
    public void preUpdate() {
        preUpdate(null);
    }
    
   

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
    
    
    /**
     * 遍历list删除无效的数据
     * @author jiangxia
     * @param list
     * @return
     */
    public static <T> List<T>  getValidList(List<T> list)
    {
        if(CollectionUtils.isEmpty(list))
        {
            return list;
        }
        if(!(list.get(0) instanceof EntityObject))
        {
            return list;
        }
        Iterator<T> iterator = list.iterator();
        while (iterator.hasNext()) 
        {
            EntityObject obj = (EntityObject)iterator.next();
            if( obj.getDelf() == 1)
            {
                iterator.remove();
            }
        }
        return list;
    }
    
    
    /**
     * 遍历list获取ids
     * @author jiangxia
     * @param list
     * @return
     */
    public static List<String>  getListIds(List<? extends EntityObject> list)
    {
        List<String> ids = Lists.newArrayList();
        if(CollectionUtils.isEmpty(list))
        {
            return ids;
        }
        for(EntityObject obj:list)
        {
            ids.add(obj.getId());
        }
        return ids;
    }
}
