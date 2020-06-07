package com.leon.controller;


import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloBoot {

    @RequestMapping(value="/sayHello",method = RequestMethod.GET)
    public String sayHello(){
        return "世界你好";
    }
}
