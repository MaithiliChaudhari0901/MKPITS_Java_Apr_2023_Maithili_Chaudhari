package com.example.project.rest;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Lazy
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class StudentInfo implements Student {
    @Override
    public String studdetails() {
        return "Hello";
    }
    public StudentInfo() {
        System.out.println("this is student details");
    }
}




