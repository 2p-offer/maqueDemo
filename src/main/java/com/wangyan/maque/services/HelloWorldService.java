package com.wangyan.maque.services;

import org.springframework.stereotype.Service;

/**
 * Created by wangyan on 2018/10/9.
 */
@Service
public class HelloWorldService {

    public String getMsg(){
        return "Hello,I'm helloWorldService";
    }
}
