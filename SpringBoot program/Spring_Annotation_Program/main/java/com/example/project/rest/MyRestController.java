package com.example.project.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
    // @Autowired
    private Student student;
//    private Student student2;

    // using constructor concept
    @Autowired
    public MyRestController(@Qualifier("studentDet") Student student) {
        this.student= student;
//        this.student2 = student2;
    }
//    //using Setter concept
//    @Autowired
//    public void setStudent(@Qualifier("studentDet") Student student) {
//
//       this.student = student;
//    }

    @GetMapping("/")
    public String stud() {
        return student.studdetails();
    }

//    @GetMapping("/check")
//    public String checkbeans() {
//        return "returns" + (student1 == student2);
    }






