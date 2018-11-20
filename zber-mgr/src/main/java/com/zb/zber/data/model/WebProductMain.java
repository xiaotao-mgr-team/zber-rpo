package com.zb.zber.data.model;

import com.zb.zber.common.core.persistence.entity.EntityObject;

import java.util.List;

public class WebProductMain extends EntityObject {

    private String pName;

    private String pIntroduce;

    private String pType;

    public String getpName() {
        return pName;
    }

    //================额外属性

    private List<WebProductInface> webProductInfaceList;

    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

    public String getpIntroduce() {
        return pIntroduce;
    }

    public void setpIntroduce(String pIntroduce) {
        this.pIntroduce = pIntroduce == null ? null : pIntroduce.trim();
    }

    public String getpType() {
        return pType;
    }

    public void setpType(String pType) {
        this.pType = pType == null ? null : pType.trim();
    }

    public List<WebProductInface> getWebProductInfaceList() {
        return webProductInfaceList;
    }

    public void setWebProductInfaceList(List<WebProductInface> webProductInfaceList) {
        this.webProductInfaceList = webProductInfaceList;
    }
}