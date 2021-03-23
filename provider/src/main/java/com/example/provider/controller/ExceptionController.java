package com.example.provider.controller;

import com.example.provider.exception.MyException;
import com.example.provider.vo.ResultEnum;
import com.example.provider.vo.ResultUtil;
import com.example.provider.vo.ResultVO;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("exception")
public class ExceptionController {

    @RequestMapping("m1")
    public String test1(){
        throw new MyException(ResultEnum.UNKNOW_ERROR);
    }

    @RequestMapping("m2")
    public String test2(){
        throw new MyException(ResultEnum.NO_ACCESS);
    }

    @RequestMapping("m3")
    @ResponseBody
    public ResultVO test3(){
        return ResultUtil.success(new Girl("d33", 24));
    }

    @Data
    static class Girl{
        private String name;
        private int age;

        public Girl(String name, int age) {
            this.age = age;
            this.name = name;
        }
    }
}
