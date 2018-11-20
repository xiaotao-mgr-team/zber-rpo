package com.zb.zber.data.model;

import com.zb.zber.common.core.persistence.entity.EntityObject;

/**
 * Created by cuixt on 2018/8/2.
 */
public class HeOrder extends EntityObject {
    private static final long serialVersionUID = -7712121782156437332L;
    private String address;
    private String product;
    private Integer unitPrice;
    private String isPay;
    private Integer number;
    private String isGetTicket;
    private String tickType;
    private Integer tickMoney;
    private String expressType;
    private Integer expressExpense;
    private String remarks;

    public String getAddress()
    {
        return this.address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getProduct()
    {
        return this.product;
    }

    public void setProduct(String product)
    {
        this.product = product;
    }

    public Integer getUnitPrice()
    {
        return this.unitPrice;
    }

    public void setUnitPrice(Integer unitPrice)
    {
        this.unitPrice = unitPrice;
    }

    public Integer getNumber()
    {
        return this.number;
    }

    public void setNumber(Integer number)
    {
        this.number = number;
    }

    public String getTickType()
    {
        return this.tickType;
    }

    public void setTickType(String tickType)
    {
        this.tickType = tickType;
    }

    public Integer getTickMoney()
    {
        return this.tickMoney;
    }

    public void setTickMoney(Integer tickMoney)
    {
        this.tickMoney = tickMoney;
    }

    public String getExpressType()
    {
        return this.expressType;
    }

    public void setExpressType(String expressType)
    {
        this.expressType = expressType;
    }

    public Integer getExpressExpense()
    {
        return this.expressExpense;
    }

    public void setExpressExpense(Integer expressExpense)
    {
        this.expressExpense = expressExpense;
    }

    public String getRemarks()
    {
        return this.remarks;
    }

    public void setRemarks(String remarks)
    {
        this.remarks = remarks;
    }

    public String getIsPay()
    {
        return this.isPay;
    }

    public void setIsPay(String isPay)
    {
        this.isPay = isPay;
    }

    public String getIsGetTicket()
    {
        return this.isGetTicket;
    }

    public void setIsGetTicket(String isGetTicket)
    {
        this.isGetTicket = isGetTicket;
    }
}
