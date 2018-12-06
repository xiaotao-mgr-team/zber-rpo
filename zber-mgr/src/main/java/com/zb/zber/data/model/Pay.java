package com.zb.zber.data.model;

import com.zb.zber.common.core.persistence.entity.EntityObject;

/**
 * Created by cuixt on 2018/8/2.
 */
public class Pay extends EntityObject {
    private static final long serialVersionUID = -1098510902236513156L;
    private Integer total;
    private Integer totalPrice;
    private Double totalFare;
    private Double totalTax;
    private Boolean isDestion;
    private String checkDate;

    public Integer getTotal()
    {
        return this.total;
    }

    public void setTotal(Integer total)
    {
        this.total = total;
    }

    public Integer getTotalPrice()
    {
        return this.totalPrice;
    }

    public void setTotalPrice(Integer totalPrice)
    {
        this.totalPrice = totalPrice;
    }

    public Double getTotalFare()
    {
        return this.totalFare;
    }

    public void setTotalFare(Double totalFare)
    {
        this.totalFare = totalFare;
    }

    public Double getTotalTax()
    {
        return this.totalTax;
    }

    public void setTotalTax(Double totalTax)
    {
        this.totalTax = totalTax;
    }

    public Boolean getIsDestion()
    {
        return this.isDestion;
    }

    public void setIsDestion(Boolean isDestion)
    {
        this.isDestion = isDestion;
    }

    public Boolean getDestion() {
        return isDestion;
    }

    public void setDestion(Boolean destion) {
        isDestion = destion;
    }

    public String getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(String checkDate) {
        this.checkDate = checkDate;
    }
}
