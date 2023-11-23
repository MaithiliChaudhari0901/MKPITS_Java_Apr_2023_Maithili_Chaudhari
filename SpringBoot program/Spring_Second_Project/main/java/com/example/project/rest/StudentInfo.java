package com.example.project.rest;
import org.springframework.stereotype.Component;

@Component
public class StudentInfo implements Student {
    @Override
    public String studdetails() {
        return "This is project";
    }
}
