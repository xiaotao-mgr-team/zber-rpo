package com.zb.zber.data.model;

import com.zb.zber.common.core.persistence.entity.EntityObject;

import java.math.BigDecimal;

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
    private Boolean isGetTicket;
    private String tickType;
    private Integer tickMoney;
    private String expressType;
    private BigDecimal expressExpense;
    private String remarks;
    private BigDecimal allMoney;
    private BigDecimal sellPrice;

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

    public BigDecimal getAllMoney() {
        return allMoney;
    }

    public void setAllMoney(BigDecimal allMoney) {
        this.allMoney = allMoney;
    }

    public BigDecimal getExpressExpense() {
        return expressExpense;
    }

    public void setExpressExpense(BigDecimal expressExpense) {
        this.expressExpense = expressExpense;
    }

    public BigDecimal getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(BigDecimal sellPrice) {
        this.sellPrice = sellPrice;
    }

    public Boolean getGetTicket() {
        return isGetTicket;
    }

    public void setGetTicket(Boolean getTicket) {
        isGetTicket = getTicket;
    }
}
