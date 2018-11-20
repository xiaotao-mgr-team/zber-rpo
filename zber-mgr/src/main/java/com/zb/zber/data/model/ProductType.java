package com.zb.zber.data.model;

import com.zb.zber.common.core.persistence.entity.EntityObject;

import java.util.List;

/**
 * Created by cuixt on 2018/8/2.
 */
public class ProductType extends EntityObject {
    private static final long serialVersionUID = -5532011693604574812L;
    private String name;
    private String introduce;
    private List<Product> productList;

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getIntroduce()
    {
        return this.introduce;
    }

    public void setIntroduce(String introduce)
    {
        this.introduce = introduce;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
