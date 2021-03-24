package com.example.consumer.controller;

import com.example.consumer.service.FeignService;
import com.example.consumer.service.HelloService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    HelloService helloService;

    @Autowired
    FeignService feignService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloService.hiService( name );
    }

    @GetMapping(value = "/hi_feign")
    public String hii(@RequestParam String name) {
        return feignService.sayHiFromClientOne( name );
    }
}
