package com.tlj.blockhead.Utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EnumT {
    SUCCESS("9527", "处理成功"),
    FAIL("000", "处理失败"),
    EXIST("555", "已存在"),
    NONENTITY("404", "不存在"),
    NULL("999", "属性为空"),
    ERROR("-1","账号或密码错误"),
    NO_LOGIN("569","未登录");



    private String code;
    private String message;
    public static EnumT find(String code){
        for(EnumT enumT:EnumT.values()){
            if(enumT.getCode().equals(code)){
                return enumT;
            }
        }
    return null;
    };

}
