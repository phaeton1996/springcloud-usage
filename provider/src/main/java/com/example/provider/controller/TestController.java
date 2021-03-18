package com.example.provider.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("tmp")
public class TestController {

    @ResponseBody
    @RequestMapping("m1")
    public String test() {
        return "d33";
    }
}
