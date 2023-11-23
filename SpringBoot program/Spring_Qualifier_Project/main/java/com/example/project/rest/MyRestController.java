package com.example.project.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
   // @Autowired
    private Student student;
    // using constructor concept
   @Autowired
   public MyRestController(@Qualifier("studentDet")Student student) {
       this.student =student;
  }
    //using Setter concept
    @Autowired
    public void setStudent(@Qualifier("studentDet") Student student) {
        this.student = student;
    }

    @GetMapping("/")
    public String studdetails() {
        return student.studdetails();
        }
    }




