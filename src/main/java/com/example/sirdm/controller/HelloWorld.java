package com.example.sirdm.controller;

import com.example.sirdm.entity.TestEntity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @Value("${myww}") // git配置文件里的key
    String myww;

    @RequestMapping("/hello")
    public String index() {
        return "Hello World" + myww;
    }

    @RequestMapping("/testEntity")
    public TestEntity getTestEntity() {
        TestEntity t = new TestEntity(1, "sss");
        return t;
    }
}
