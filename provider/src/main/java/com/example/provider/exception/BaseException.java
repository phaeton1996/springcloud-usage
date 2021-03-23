package com.example.provider.exception;

import com.example.provider.vo.ResultEnum;

public class BaseException extends RuntimeException {

    private ResultEnum resultEnum;

    public ResultEnum getResultEnum() {
        return resultEnum;
    }

    public BaseException(ResultEnum resultEnum){
        super(resultEnum.getMsg());
        this.resultEnum = resultEnum;
    }
}
