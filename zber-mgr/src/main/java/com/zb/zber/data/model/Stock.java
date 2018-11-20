package com.zb.zber.data.model;

import com.zb.zber.common.core.persistence.entity.EntityObject;

/**
 * Created by cuixt on 2018/8/2.
 */
public class Stock extends EntityObject {
    private static final long serialVersionUID = 4887667294248215755L;
    private String productId;
    private String productName;
    private int totalNumber;
    private int leftNumber;
    private int callNumber;
    private String status;
    private String statusStr;

    public void format()
    {
        if ("0".equals(getStatus())) {
            this.statusStr = "生效中";
        } else {
            this.statusStr = "关闭中";
        }
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

    public int getTotalNumber()
    {
        return this.totalNumber;
    }

    public void setTotalNumber(int totalNumber)
    {
        this.totalNumber = totalNumber;
    }

    public int getLeftNumber()
    {
        return this.leftNumber;
    }

    public void setLeftNumber(int leftNumber)
    {
        this.leftNumber = leftNumber;
    }

    public int getCallNumber()
    {
        return this.callNumber;
    }

    public void setCallNumber(int callNumber)
    {
        this.callNumber = callNumber;
    }

    public String getStatus()
    {
        return this.status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getStatusStr()
    {
        return this.statusStr;
    }

    public void setStatusStr(String statusStr)
    {
        this.statusStr = statusStr;
    }
}
