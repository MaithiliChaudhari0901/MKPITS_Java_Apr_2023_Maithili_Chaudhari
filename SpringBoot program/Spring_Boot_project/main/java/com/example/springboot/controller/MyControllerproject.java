package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyControllerproject {
    @GetMapping ("/mypage")
    public String displaymethod(){
        return "hello";
    }
}
