package com.example.id.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${myww}") // git配置文件里的key
    String myww;

    @RequestMapping("/hello")
    public String index() {
        return "2Hello World" + myww;
    }

}
