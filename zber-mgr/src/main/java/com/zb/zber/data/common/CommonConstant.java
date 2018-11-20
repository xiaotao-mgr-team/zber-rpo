package com.zb.zber.data.common;

/**
 * Created by cuixt on 2018/8/10.
 */
public abstract class CommonConstant {
    public static final String AREA = "AREA_PROVINCE_";
    public static final String PRODUCT_PRICE = "PRODUCT_UNIT_PRICE_";
    public static final String PRODUCT_NAME = "PRODUCT_UNIT_NAME_";
    public static final String EXPRESS = "EXPRESS_";
    public static final String USER = "USER";

    public static enum UploadFileType
    {
        File("file", "文件"),  IMAGE("img", "图片");

        private String code;
        private String msg;

        private UploadFileType(String code, String msg)
        {
            this.code = code;
            this.msg = msg;
        }

        public String getCode()
        {
            return this.code;
        }

        public void setCode(String code)
        {
            this.code = code;
        }

        public String getMsg()
        {
            return this.msg;
        }

        public void setMsg(String msg)
        {
            this.msg = msg;
        }
    }
}
