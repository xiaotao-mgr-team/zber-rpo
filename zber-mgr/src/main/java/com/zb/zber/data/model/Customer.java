package com.zb.zber.data.model;

import com.zb.zber.common.core.persistence.entity.EntityObject;
import com.zb.zber.common.utils.DatetimeUtilies;
import org.apache.commons.lang.StringUtils;

import java.util.Date;

/**
 * Created by cuixt on 2018/8/2.
 */
public class Customer extends EntityObject {
    private static final long serialVersionUID = 4630558416538939809L;
    private String address;
    private String tel;
    private String name;
    private String product;
    private String destion;
    private Integer unitPrice;
    private Integer sellPrice;
    private Boolean isPay;
    private String expressType;
    private Integer number;
    private Boolean isUseModule;
    private Integer expense;
    private Boolean isGetTicket;
    private String tickType;
    private Double tickMoney;
    private Double tickExpense;
    private String remarks;
    private Date orderDate;

    private String isPayStr;
    private String isGetTicketStr;
    private String orderDateStr;
    private Double sumMoney;

    private String tickTypeStr;
    private String tickMoneyStr;
    private String tickExpenseStr;
    private Double extendMoney;

    private int ix;//用来排序的


    //==额外展示属性
    private String expressName;
    private String productName;

    public void format()
    {
        if(StringUtils.isBlank(getTickType())){
            setTickTypeStr("-");
        }else{
            if("5P".equals(getTickType())){
                setTickTypeStr("普票");
            }else{
                setTickTypeStr("增票");
            }
        }
        if (getIsGetTicket().booleanValue()) {
            setIsGetTicketStr("未开具");
        } else {
            setIsGetTicketStr("开具");
        }
        if (getIsPay().booleanValue()) {
            setIsPayStr("到付");
        } else {
            setIsPayStr("现款");
        }
        if (this.orderDate != null) {
            setOrderDateStr(DatetimeUtilies.formatDateTime("yyyy-MM-dd", this.orderDate));
        }
    }

    public String getTickTypeStr() {
        return tickTypeStr;
    }

    public void setTickTypeStr(String tickTypeStr) {
        this.tickTypeStr = tickTypeStr;
    }

    public String getTickMoneyStr() {
        return tickMoneyStr;
    }

    public void setTickMoneyStr(String tickMoneyStr) {
        this.tickMoneyStr = tickMoneyStr;
    }

    public String getTickExpenseStr() {
        return tickExpenseStr;
    }

    public void setTickExpenseStr(String tickExpenseStr) {
        this.tickExpenseStr = tickExpenseStr;
    }

    public String getAddress()
    {
        return this.address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getTel()
    {
        return this.tel;
    }

    public void setTel(String tel)
    {
        this.tel = tel;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getProduct()
    {
        return this.product;
    }

    public void setProduct(String product)
    {
        this.product = product;
    }

    public String getDestion()
    {
        return this.destion;
    }

    public void setDestion(String destion)
    {
        this.destion = destion;
    }

    public Integer getUnitPrice()
    {
        return this.unitPrice;
    }

    public void setUnitPrice(Integer unitPrice)
    {
        this.unitPrice = unitPrice;
    }

    public Integer getSellPrice()
    {
        return this.sellPrice;
    }

    public void setSellPrice(Integer sellPrice)
    {
        this.sellPrice = sellPrice;
    }

    public String getExpressType()
    {
        return this.expressType;
    }

    public void setExpressType(String expressType)
    {
        this.expressType = expressType;
    }

    public Boolean getIsPay()
    {
        return this.isPay;
    }

    public void setIsPay(Boolean isPay)
    {
        this.isPay = isPay;
    }

    public Integer getNumber()
    {
        return this.number;
    }

    public void setNumber(Integer number)
    {
        this.number = number;
    }

    public Boolean getIsUseModule()
    {
        return this.isUseModule;
    }

    public void setIsUseModule(Boolean isUseModule)
    {
        this.isUseModule = isUseModule;
    }

    public Integer getExpense()
    {
        return this.expense;
    }

    public void setExpense(Integer expense)
    {
        this.expense = expense;
    }

    public Boolean getIsGetTicket()
    {
        return this.isGetTicket;
    }

    public void setIsGetTicket(Boolean isGetTicket)
    {
        this.isGetTicket = isGetTicket;
    }

    public String getTickType()
    {
        return this.tickType;
    }

    public void setTickType(String tickType)
    {
        this.tickType = tickType;
    }

    public Double getTickMoney()
    {
        return this.tickMoney;
    }

    public void setTickMoney(Double tickMoney)
    {
        this.tickMoney = tickMoney;
    }

    public String getRemarks()
    {
        return this.remarks;
    }

    public void setRemarks(String remarks)
    {
        this.remarks = remarks;
    }

    public Date getOrderDate()
    {
        return this.orderDate;
    }

    public void setOrderDate(Date orderDate)
    {
        this.orderDate = orderDate;
    }

    public String getProductName()
    {
        return this.productName;
    }

    public void setProductName(String productName)
    {
        this.productName = productName;
    }

    public String getExpressName()
    {
        return this.expressName;
    }

    public void setExpressName(String expressName)
    {
        this.expressName = expressName;
    }

    public String getIsPayStr()
    {
        return this.isPayStr;
    }

    public void setIsPayStr(String isPayStr)
    {
        this.isPayStr = isPayStr;
    }

    public String getIsGetTicketStr()
    {
        return this.isGetTicketStr;
    }

    public void setIsGetTicketStr(String isGetTicketStr)
    {
        this.isGetTicketStr = isGetTicketStr;
    }

    public String getOrderDateStr()
    {
        return this.orderDateStr;
    }

    public void setOrderDateStr(String orderDateStr)
    {
        this.orderDateStr = orderDateStr;
    }

    public Double getSumMoney()
    {
        return this.sumMoney;
    }

    public void setSumMoney(Double sumMoney)
    {
        this.sumMoney = sumMoney;
    }



    public Boolean getPay() {
        return isPay;
    }

    public void setPay(Boolean pay) {
        isPay = pay;
    }

    public Boolean getUseModule() {
        return isUseModule;
    }

    public void setUseModule(Boolean useModule) {
        isUseModule = useModule;
    }

    public Boolean getGetTicket() {
        return isGetTicket;
    }

    public void setGetTicket(Boolean getTicket) {
        isGetTicket = getTicket;
    }

    public Double getTickExpense() {
        return tickExpense;
    }

    public void setTickExpense(Double tickExpense) {
        this.tickExpense = tickExpense;
    }

    public Double getExtendMoney() {
        return extendMoney;
    }

    public void setExtendMoney(Double extendMoney) {
        this.extendMoney = extendMoney;
    }

    public int getIx() {
        return ix;
    }

    public void setIx(int ix) {
        this.ix = ix;
    }
}
