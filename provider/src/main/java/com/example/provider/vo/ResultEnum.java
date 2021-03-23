package com.example.provider.vo;

import lombok.Getter;

@Getter
public enum ResultEnum {

    NO_ACCESS(-1, "未登陆"),
    UNKNOW_ERROR(-99, "未知错误"),
    SUCCESS(0, "成功"),
    ;

    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
