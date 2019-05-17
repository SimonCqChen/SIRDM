package com.example.sirdm.controller;

import com.example.sirdm.entity.TestEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }

    @RequestMapping("/testEntity")
    public TestEntity getTestEntity() {
        TestEntity t = new TestEntity(1, "sss");
        return t;
    }
}
