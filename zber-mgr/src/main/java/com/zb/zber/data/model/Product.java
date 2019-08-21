package com.zb.zber.data.model;

import com.zb.zber.common.core.persistence.entity.EntityObject;
import com.zb.zber.common.utils.StringUtilies;
import com.zb.zber.data.enums.FileDomainEnum;
import com.zb.zber.data.handler.UrlHandler;
import org.apache.commons.lang.StringUtils;

import java.util.List;

/**
 * Created by cuixt on 2018/8/2.
 */
public class Product extends EntityObject {
    private static final long serialVersionUID = 5599669200119937254L;
    private String typeId;
    private String introduce;
    private String img; //用于mgr展示
    private String title;
    private Integer price;
    private String bigP;
    private String smallP;
    private String isDisWebsite;

    //===额外属性
    private String imgUrl;
    private List<String> bigPUrl;
    private List<String> smallPUrl;

    public void format()
    {
        if (this.price == null) {
            setPrice(Integer.valueOf(0));
        }
        if(StringUtils.isNotBlank(typeId)){
            String prox = "";
            switch (typeId){
                case "0":
                    prox = FileDomainEnum.ZBER_SF_PRODUCT.getCode();break;
                case "1":
                    prox = FileDomainEnum.ZBER_HXQ_PRODUCT.getCode();break;
                case "2":
                    prox = FileDomainEnum.ZBER_ZX_PRODUCT.getCode();break;
                case "3":
                    prox = FileDomainEnum.ZBER_QP_PRODUCT.getCode();break;
                case "4":
                    prox = FileDomainEnum.ZBER_F_PRODUCT.getCode();break;
                case "5":
                    prox = FileDomainEnum.ZBER_MJ_PRODUCT.getCode();break;
                case "6":
                    prox = FileDomainEnum.ZBER_Q_PRODUCT.getCode();break;
                case "7":
                    prox = FileDomainEnum.ZBER_YP_PRODUCT.getCode();break;
                case "8":
                    prox = FileDomainEnum.ZBER_J_PRODUCT.getCode();break;
                case "9":
                    prox = FileDomainEnum.ZBER_SJJ_PRODUCT.getCode();break;
                case "10":
                    prox = FileDomainEnum.ZBER_LDG_PRODUCT.getCode();break;
                case "11":
                    prox = FileDomainEnum.ZBER_SJJ_PRODUCT.getCode();break;
                case "15":
                    prox = FileDomainEnum.ZBER_ZL_PRODUCT.getCode();break;
                    default:break;
            }
            if (!StringUtilies.isNullOrEmpty(this.img)) {
                setImgUrl(UrlHandler.getImageUrlWithOutSuffix(this.img, prox));
            }
            if (!StringUtilies.isNullOrEmpty(this.bigP)) {
                setBigPUrl(UrlHandler.getImagesUrlWithOutSuffix(this.bigP, prox));
            }
            if (!StringUtilies.isNullOrEmpty(this.smallP)) {
                setSmallPUrl(UrlHandler.getImagesUrlWithOutSuffix(this.smallP, prox));
            }
        }

    }

    public String getTypeId()
    {
        return this.typeId;
    }

    public void setTypeId(String typeId)
    {
        this.typeId = typeId;
    }

    public String getIntroduce()
    {
        return this.introduce;
    }

    public void setIntroduce(String introduce)
    {
        this.introduce = introduce;
    }

    public String getImg()
    {
        return this.img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitle()
    {
        return this.title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public Integer getPrice()
    {
        return this.price;
    }

    public void setPrice(Integer price)
    {
        this.price = price;
    }

    public String getImgUrl()
    {
        return this.imgUrl;
    }

    public void setImgUrl(String imgUrl)
    {
        this.imgUrl = imgUrl;
    }

    public String getBigP() {
        return bigP;
    }

    public void setBigP(String bigP) {
        this.bigP = bigP;
    }

    public String getSmallP() {
        return smallP;
    }

    public void setSmallP(String smallP) {
        this.smallP = smallP;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public List<String> getBigPUrl() {
        return bigPUrl;
    }

    public void setBigPUrl(List<String> bigPUrl) {
        this.bigPUrl = bigPUrl;
    }

    public List<String> getSmallPUrl() {
        return smallPUrl;
    }

    public void setSmallPUrl(List<String> smallPUrl) {
        this.smallPUrl = smallPUrl;
    }

    public String getIsDisWebsite() {
        return isDisWebsite;
    }

    public void setIsDisWebsite(String isDisWebsite) {
        this.isDisWebsite = isDisWebsite;
    }
}
