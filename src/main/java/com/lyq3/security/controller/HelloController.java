package com.lyq3.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public  String  hello(){
        return "hello页面";
    }

    @GetMapping("/login")
    public String login() {
        return "登录页面";
    }

    @GetMapping("/")
    public  String index(){
        return "首页";
    }
}
