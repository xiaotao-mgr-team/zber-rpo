package com.zb.zber.data.handler;

import com.zb.zber.common.core.context.app.cfg.initor.RootConfigInitor;
import com.zb.zber.common.core.context.app.cfg.module.ModuleConfigHandler;
import com.zb.zber.common.core.exception.AppException;
import com.zb.zber.common.core.exception.ExCode;
import org.apache.commons.lang.StringUtils;

/**
 * Created by cuixt on 2018/8/10.
 */

public class FilePathHandler {



    // 通过模块获取相应的配置地址
    public static String getFilePath(String moduleName, String key) {
        String path = ModuleConfigHandler.getSimpleProp(moduleName, key);
        if (StringUtils.isEmpty(path)) {
            throw new AppException(ExCode.SYS_002);
        }
        return path;
    }

    /*
     * // 获取文件存储的绝对路径 public static String getRootUploadUrl() {
     *
     * String rootUrl; try { rootUrl = (String)RootConfigInitor.PARAMS.get("file.root.upload.path", null); } catch
     * (Exception e) { e.printStackTrace(); return null; } return rootUrl; }
     */

    // 获取文件访问的绝对路径
    public static String getRootDownUrl() {

        String rootUrl;
        try {
            rootUrl = (String) RootConfigInitor.PARAMS.get("file.root.down.path", null);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return rootUrl;
    }

    // 获取图片存储的相对根路径
    public static String getRelativeUploadImageUrl() {

        String rootUrl;
        try {
            rootUrl = (String) RootConfigInitor.PARAMS.get("file.relative.img.upload.path", null);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return rootUrl;
    }

    // 获取图片下载的绝对路径
    public static String getRootDownImageUrl() {
        return (String) RootConfigInitor.PARAMS.get("file.root.img.down.path", "http://mgr.zbering.com/data/formal/img/");
    }

    // 获取文件下载的绝对路径
    public static String getRootDownFileToolUrl() {
        return (String) RootConfigInitor.PARAMS.get("file.root.filetool.down.path", null);
    }

    // 获取视屏下载的绝对路径
    public static String getRootDownVideoUrl() {
        return (String) RootConfigInitor.PARAMS.get("file.root.video.down.path", null);
    }

    // 获取临时上传文件的存储绝对根路径
    public static String getRootTempUploadUrl() {
        return (String) RootConfigInitor.PARAMS.get("file.root.upload.temp.path", null);
    }

    // 获取临时上传文件的下载绝对根路径
    public static String getRootTempDownUrl() {
        return (String) RootConfigInitor.PARAMS.get("file.root.down.temp.path", null);
    }

    // 获取临时上传图片存储绝对对根路径
    public static String getRootTempUploadImageUrl() {

        String rootUrl;
        try {
            rootUrl = (String) RootConfigInitor.PARAMS.get("file.root.img.upload.temp.path", null);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return rootUrl;
    }

    // 获取临时上传图片下载绝对对根路径
    public static String getRootTempDownImageUrl() {

        String rootUrl;
        try {
            rootUrl = (String) RootConfigInitor.PARAMS.get("file.root.img.down.temp.path", null);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return rootUrl;
    }


    // 获取轮播图片相对上传路径

    public static String getSliderPicUploadPath() {

        return getRelativeUploadImageUrl() + getFilePath("goods", "slidePath");
    }

    // 获取轮播临时图片上传绝对路径
    public static String getTempRootSliderPicUploadPath() {
        return getRootTempUploadImageUrl() + getFilePath("goods", "slidePath");
    }

    // 获取轮播图片下载路径

    public static String getSliderPicDownPath() {

        return getRootDownImageUrl() + getFilePath("goods", "slidePath");
    }

    // 获取商品图片上传路径

    public static String getGoodsPicUploadPath() {

        return getRelativeUploadImageUrl() + getFilePath("goods", "goodsImagePath");
    }

    // 获取商品图片下载路径

    public static String getGoodsPicDownPath() {

        return getRootDownImageUrl() + getFilePath("goods", "goodsImagePath");
    }

    // 获取商品主图片相对上传路径
    public static String getGoodsPrimaryPicUploadPath(String goodsCode) {
        return getGoodsPicUploadPath() + goodsCode + "/";
    }

    // 获取临时商品主图片相对上传路径
    public static String getTempGoodsPrimaryPicUploadPath(String goodsCode) {
        return getRootTempUploadImageUrl() + getFilePath("goods", "goodsImagePath") + goodsCode + "/";
    }

    /**
     * 获取临时商品主图片下载路径
     *
     * @param goodsCode 商品编码
     * @return 临时商品主图片下载路径
     */
    public static String getTempGoodsPrimaryPicDownPath(String goodsCode) {
        return getRootTempDownImageUrl() + getFilePath("goods", "goodsImagePath") + goodsCode + "/";
    }

    // 获取商品主图片下载路径
    public static String getGoodsPrimaryPicDownPath(String goodsCode) {
        return getRootDownImageUrl() + getFilePath("goods", "goodsImagePath") + goodsCode + "/";
    }

    /**
     * 获取会员头像上传路径
     *
     * @param customerCode
     * @return
     */
    public static String getCustomerHeadPicUploadPath(String customerCode) {
        return getRelativeUploadImageUrl() + getFilePath("user", "vipHeadImagePath") + customerCode + "/";
    }

    /**
     * 获取会员头像下载路径
     *
     * @param customerCode
     * @return
     */
    public static String getCustomerHeadPicDownPath(String customerCode) {
        return getRootDownImageUrl() + getFilePath("user", "vipHeadImagePath") + customerCode + "/";
    }

    /**
     * 获取退款凭证临时上传路径
     *
     * @param refundCode
     * @return
     */
    public static String getRefundPicTempUploadPath(String refundCode) {
        return getRootTempUploadImageUrl() + getFilePath("order", "refundImagePath") + refundCode + "/";
    }

    /**
     * 获取退款凭证临时下载路径
     *
     * @param refundCode
     * @return
     */
    public static String getRefundPicTempDownPath(String refundCode) {
        return getRootTempDownImageUrl() + getFilePath("order", "refundImagePath") + refundCode + "/";
    }

    /**
     * 获取退款凭证上传路径
     *
     * @return
     */
    public static String getRefundPicUploadPath(String refundCode) {
        return getRelativeUploadImageUrl() + getFilePath("order", "refundImagePath") + refundCode + "/";
    }

    /**
     * 获取退款凭证下载路径
     *
     * @return
     */
    public static String getRefundPicDownPath(String refundCode) {
        return getRootDownImageUrl() + getFilePath("order", "refundImagePath") + refundCode + "/";
    }

    /**
     * 获取批量退款单txt的文件存储路径
     *
     * @return
     */
    public static String getRefundFileUploadPath() {
        return getRootTempUploadUrl() + getFilePath("order", "refundFilePath");
    }

    /**
     * 获取商品定时调价价格Excel文件存储路径
     *
     * @return
     */
    public static String getFuturePriceExcelPath() {
        return getRootTempUploadUrl() + getFilePath("goods", "futurePriceExcelPath");
    }

    /**
     * 获取批量退款单txt的文件下载路径
     *
     * @return
     */
    public static String getRefundFileDownPath() {
        return getRootTempDownUrl() + getFilePath("order", "refundFilePath");
    }

    /**
     * 获取退货凭证临时上传路径
     *
     * @return
     */
    public static String getReturnPicTempUploadPath() {
        return getRootTempUploadImageUrl() + getFilePath("order", "returnImagePath");
    }

    /**
     * 获取退货凭证临时下载路径
     *
     * @return
     */
    public static String getReturnPicTempDownPath() {
        return getRootTempDownImageUrl() + getFilePath("order", "returnImagePath");
    }

    /**
     * 获取退货凭证上传路径
     *
     * @return
     */
    public static String getReturnPicUploadPath() {
        return getRelativeUploadImageUrl() + getFilePath("order", "returnImagePath");
    }

    /**
     * 获取退货凭证下载路径
     *
     * @return
     */
    public static String getReturnPicDownPath() {
        return getRootDownImageUrl() + getFilePath("order", "returnImagePath");
    }
}
