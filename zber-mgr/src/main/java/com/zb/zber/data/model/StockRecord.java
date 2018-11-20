package com.zb.zber.data.model;

import com.zb.zber.common.core.persistence.entity.EntityObject;
import com.zb.zber.common.utils.DatetimeUtilies;

/**
 * Created by cuixt on 2018/8/2.
 */
public class StockRecord extends EntityObject {
    private static final long serialVersionUID = -7651622198420940251L;
    private String productId;
    private String productName;
    private String type;
    private String number;
    private Integer leftNumber;
    private String userName;
    private String createTimeStr;

    public void format()
    {
        setCreateTimeStr(DatetimeUtilies.formatDateTime("yyyy-MM-dd HH:mm:ss", getCreateTime()));
    }

    public String getProductId()
    {
        return this.productId;
    }

    public void setProductId(String productId)
    {
        this.productId = productId;
    }

    public String getProductName()
    {
        return this.productName;
    }

    public void setProductName(String productName)
    {
        this.productName = productName;
    }

    public String getType()
    {
        return this.type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getNumber()
    {
        return this.number;
    }

    public void setNumber(String number)
    {
        this.number = number;
    }

    public Integer getLeftNumber()
    {
        return this.leftNumber;
    }

    public void setLeftNumber(Integer leftNumber)
    {
        this.leftNumber = leftNumber;
    }

    public String getUserName()
    {
        return this.userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getCreateTimeStr()
    {
        return this.createTimeStr;
    }

    public void setCreateTimeStr(String createTimeStr)
    {
        this.createTimeStr = createTimeStr;
    }
}
