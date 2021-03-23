package com.example.provider.exception;

import com.example.provider.vo.ResultEnum;

public class MyException extends BaseException {

    public MyException(ResultEnum resultEnum) {
        super(resultEnum);
        System.out.println("finish your code here!");
    }
}
