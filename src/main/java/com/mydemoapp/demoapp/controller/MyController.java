package com.mydemoapp.demoapp.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/")
public class MyController {

    @RequestMapping("/home")
    public  String homePage(){
        return  "welcome to home page";
    }
    @RequestMapping("/test")
    public  String testPage(){
        return  "welcome to Testing  page";
    }
    @RequestMapping("/dev")
    public  String devPage(){
        return  "welcome to Dev page";
    }
}
