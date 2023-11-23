package com.example.project.rest;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
@Lazy



@Component
public class StudentInfo implements Student {
    @Override
    public String studdetails() {
        return "Hello";
    }
    public StudentInfo() {
        System.out.println("this is student details ");

    }
}




