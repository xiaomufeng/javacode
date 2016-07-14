package com.java.annotation;


/**
 * @author dw 商品权限操作信息
 */
public enum PermOperation {
    GOODSPRICE("商品定价", "GOODSPRICE"), ORDERBUILD("创建订单", "ORDERBUILD");

    private PermOperation(String desc, String codeName){
        this.desc = desc;
        this.code = codeName;
    }

    private String desc;

    public String getDesc() {
        return desc;
    }

    private String code;

    public String getCode() {
        return code;
    }
}
