package com.example.project.rest;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
//@Lazy
@Component
public class StudentDet implements Student {

    @Override
    public String studdetails() {
        return "Studentdetail";
    }
    public StudentDet() {

        System.out.println("This is StudentDet");
    }
}
