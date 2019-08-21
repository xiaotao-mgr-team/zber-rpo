package com.zb.zber.data.enums;

/**
 * Created by cuixt on 2018/8/10.
 */
public enum FileDomainEnum {
    ZBER_PRODUCT("product", "产品"),
    ZBER_INTRODUCE("introduce", "产品"),

    ZBER_BEIDAI_PRODUCT("product/beiban", "电动送风"),
    ZBER_J_PRODUCT("product/daqi-J", "打气机"),
    ZBER_SF_PRODUCT("product/diandong-SF", "电动送风"),
    ZBER_DZX_PRODUCT("product/dzx", "大专小"),
    ZBER_MJ_PRODUCT("product/fangdu-MJ", "防毒面具"),
    ZBER_F_PRODUCT("product/fanghua-F", "防化服"),
    ZBER_HB_PRODUCT("product/hb", "轮转图片"),
    ZBER_SJJ_PRODUCT("product/jiuy-SJJ", "救援三脚架"),
    ZBER_HXQ_PRODUCT("product/kongqi-HXQ", "空气呼吸器"),
    ZBER_Q_PRODUCT("product/paotou-Q", "抛投器"),
    ZBER_YP_PRODUCT("product/qianshui-YP", "潜水用品"),
    ZBER_QP_PRODUCT("product/qiping", "气瓶"),
    ZBER_SDQ_PRODUCT("product/sheding-Q", "射钉枪"),
    ZBER_JCY_PRODUCT("product/siheyi", "四合一气体检测仪"),
    ZBER_XYQ_PRODUCT("product/xiyanqi-XYQ", "洗眼器"),
    ZBER_ZL_PRODUCT("product/zhoul-fengji", "轴流风机"),
    ZBER_ZX_PRODUCT("product/zixi", "自吸"),
    ZBER_LDG_PRODUCT("product/lvdu-G", "滤毒罐");




    private String code;
    private String msg;

    private FileDomainEnum(String code, String msg)
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
