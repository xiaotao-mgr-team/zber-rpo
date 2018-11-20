package com.zb.zber.data.model;

import com.zb.zber.common.core.persistence.entity.EntityObject;
import com.zb.zber.common.utils.StringUtilies;
import com.zb.zber.data.enums.FileDomainEnum;
import com.zb.zber.data.handler.UrlHandler;

public class WebProductInface extends EntityObject {

    private String mainId;

    private String iName;

    private String iIntroduce;

    private String bigP;

    private String smallP;

    private String pName;

    private String bigPUrl;

    private String smallPUrl;

    public String getMainId() {
        return mainId;
    }

    public void setMainId(String mainId) {
        this.mainId = mainId == null ? null : mainId.trim();
    }

    public String getiName() {
        return iName;
    }

    public void setiName(String iName) {
        this.iName = iName == null ? null : iName.trim();
    }

    public String getiIntroduce() {
        return iIntroduce;
    }

    public void setiIntroduce(String iIntroduce) {
        this.iIntroduce = iIntroduce == null ? null : iIntroduce.trim();
    }

    public String getBigP() {
        return bigP;
    }

    public void setBigP(String bigP) {
        this.bigP = bigP == null ? null : bigP.trim();
    }

    public String getSmallP() {
        return smallP;
    }

    public void setSmallP(String smallP) {
        this.smallP = smallP == null ? null : smallP.trim();
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

    public String getBigPUrl() {
        return bigPUrl;
    }

    public void setBigPUrl(String bigPUrl) {
        this.bigPUrl = bigPUrl;
    }

    public String getSmallPUrl() {
        return smallPUrl;
    }

    public void setSmallPUrl(String smallPUrl) {
        if (!StringUtilies.isNullOrEmpty(this.smallP)) {
            this.smallPUrl = (UrlHandler.getImageUrlWithOutSuffix(this.smallP, FileDomainEnum.ZBER_PRODUCT.getCode()));
        }
    }
}