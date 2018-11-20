package com.zb.zber.data.model;

import com.zb.zber.common.core.persistence.entity.EntityObject;

/**
 * Created by cuixt on 2018/8/2.
 */
public class Express extends EntityObject {
    private static final long serialVersionUID = -1280229678448413938L;
    private String productId;
    private String productName;
    private String destion;
    private String destionName;
    private String company;
    private Integer price;

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

    public String getDestion()
    {
        return this.destion;
    }

    public void setDestion(String destion)
    {
        this.destion = destion;
    }

    public String getDestionName()
    {
        return this.destionName;
    }

    public void setDestionName(String destionName)
    {
        this.destionName = destionName;
    }

    public String getCompany()
    {
        return this.company;
    }

    public void setCompany(String company)
    {
        this.company = company;
    }

    public Integer getPrice()
    {
        return this.price;
    }

    public void setPrice(Integer price)
    {
        this.price = price;
    }
}
