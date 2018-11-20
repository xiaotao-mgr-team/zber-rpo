package com.zb.zber.data.model;
import com.zb.zber.common.core.persistence.entity.EntityObject;

public class WebProduct extends EntityObject {

    private String infaceId;

    private String bigP;

    private String smallP;

    private String pName;

    private String pIntro;

    public String getInfaceId() {
        return infaceId;
    }

    public void setInfaceId(String infaceId) {
        this.infaceId = infaceId == null ? null : infaceId.trim();
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

    public String getpIntro() {
        return pIntro;
    }

    public void setpIntro(String pIntro) {
        this.pIntro = pIntro == null ? null : pIntro.trim();
    }
}