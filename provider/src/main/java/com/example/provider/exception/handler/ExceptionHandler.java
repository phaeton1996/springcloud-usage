package com.example.provider.exception.handler;

import com.example.provider.exception.MyException;
import com.example.provider.vo.ResultEnum;
import com.example.provider.vo.ResultUtil;
import com.example.provider.vo.ResultVO;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandler {

    @ResponseBody
    @org.springframework.web.bind.annotation.ExceptionHandler(MyException.class)
    public ResultVO handle(MyException e){
        return ResultUtil.error(e.getResultEnum());
    }

    @ResponseBody
    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
    public ResultVO handle2(Exception e){
        System.out.println(e.getMessage());
        return ResultUtil.error(ResultEnum.UNKNOW_ERROR);
    }
}
