package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController {

    @RequestMapping("/welcome")
    public String print(){
        String text="this is a private page";
        text+="this page is not accessed by everyone";
        return text;
    }

    @RequestMapping("/home")
    public String home(){
        return "{\"name\":\"Sharma\"}";
    }
}
