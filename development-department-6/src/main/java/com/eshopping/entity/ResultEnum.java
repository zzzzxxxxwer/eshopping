package com.eshopping.entity;

/**
 * @author ThisPC
 * @date 2021/3/23
 */
public enum ResultEnum {
    // 这里是可以自己定义的，方便与前端交互即可
    UNKNOWN_ERROR(-1,"未知错误"),
    SUCCESS(10000,"成功"),
    USER_NOT_EXIST(1,"用户不存在"),
    USER_IS_EXISTS(2,"用户已存在"),
    DATA_IS_NULL(3,"数据为空"),
    ;
    private Integer flag;
    private String code;

    ResultEnum(Integer flag, String code) {
        this.flag = flag;
        this.code = code;
    }

    public Integer getFlag() { return flag; }

    public String getCode() { return code; }
}
