package com.example.provider.vo;

import lombok.Data;

@Data
public class ResultVO<T> {

    private T data;
    private int code;
    private String msg;


}
