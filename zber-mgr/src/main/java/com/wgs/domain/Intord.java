package com.wgs.domain;

import java.util.Date;

public class Intord {
    private String id;

    private String createUserId;

    private Date createTime;

    private String modifyUserId;

    private Date modifyTime;

    private Integer deleteFlag;

    private String remark;

    private String title;

    private String introduce;

    private String pSelf;

    private String pRight;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getModifyUserId() {
        return modifyUserId;
    }

    public void setModifyUserId(String modifyUserId) {
        this.modifyUserId = modifyUserId == null ? null : modifyUserId.trim();
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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
}