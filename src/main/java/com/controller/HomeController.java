package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/rest")
public class HomeController {
    @RequestMapping("/")
    public @ResponseBody String index(){
        return "rest api";
    }
}
