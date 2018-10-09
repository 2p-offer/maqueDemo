package com.wangyan.maque.controller;

import com.wangyan.maque.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangyan on 2018/10/9.
 */
@RestController
public class HelloWorldDemo {

    @Autowired
    HelloWorldService helloWorldService;

    @RequestMapping(path = {"/helloWorldDemo"})
    public String HelloSpring (){
        String msg = helloWorldService.getMsg();
        System.out.println("hello my first spring boot demo");
        return "hello my first spring boot demo================= serviceMsg: "+msg;
    }
}
