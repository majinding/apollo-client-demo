package com.example.demo.controller;

import com.example.demo.config.MyApolloConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class MyController {


    @Autowired
    MyApolloConfig myApolloConfig;

    @GetMapping(value = "/get")
    public Object get(){
        HashMap<String,Object> map = new HashMap<>();
        map.put("date", System.currentTimeMillis());
        map.put("key2",myApolloConfig.getKey2());

        return map;
    }

}
