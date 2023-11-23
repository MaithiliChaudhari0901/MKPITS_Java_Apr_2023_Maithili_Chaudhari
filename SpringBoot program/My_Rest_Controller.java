package com.example.project.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
   // @Autowired
    private Student student;

    @GetMapping("/")
    public String studdetails() {
        return student.studdetails();
        }
    }




