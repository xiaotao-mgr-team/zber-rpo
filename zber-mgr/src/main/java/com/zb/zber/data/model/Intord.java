package com.zb.zber.data.model;

import com.zb.zber.common.core.persistence.entity.EntityObject;
import com.zb.zber.common.utils.StringUtilies;
import com.zb.zber.data.enums.FileDomainEnum;
import com.zb.zber.data.handler.UrlHandler;

import java.util.List;

public class Intord extends EntityObject {

    private String title;

    private String introduce;

    private String pSelf;//自我介绍

    private String pRight;//公司资质

    private List<String> pSelfs;
    private List<String> pRights;

    public void format(){
        if (!StringUtilies.isNullOrEmpty(this.pRight)) {
            setpRights(UrlHandler.getImagesUrlWithOutSuffix(this.pRight, FileDomainEnum.ZBER_INTRODUCE.getCode()));
        }
        if (!StringUtilies.isNullOrEmpty(this.pSelf)) {
            setpSelfs(UrlHandler.getImagesUrlWithOutSuffix(this.pSelf, FileDomainEnum.ZBER_INTRODUCE.getCode()));
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    public String getpSelf() {
        return pSelf;
    }

    public void setpSelf(String pSelf) {
        this.pSelf = pSelf == null ? null : pSelf.trim();
    }

    public String getpRight() {
        return pRight;
    }

    public void setpRight(String pRight) {
        this.pRight = pRight == null ? null : pRight.trim();
    }

    public List<String> getpSelfs() {
        return pSelfs;
    }

    public void setpSelfs(List<String> pSelfs) {
        this.pSelfs = pSelfs;
    }

    public List<String> getpRights() {
        return pRights;
    }

    public void setpRights(List<String> pRights) {
        this.pRights = pRights;
    }
}