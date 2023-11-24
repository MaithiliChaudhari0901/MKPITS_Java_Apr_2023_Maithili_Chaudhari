package com.example.project.rest;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//@Lazy

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class StudentInfo implements Student {
    @Override
    public String studdetails() {
        return "Hello";
    }
    public StudentInfo() {
        System.out.println("this is student details");
    }
    @PostConstruct
    public void StartWork(){
        System.out.println("Start work" +getClass().getSimpleName());
    }
    @PostConstruct
    public void StartWork1(){
        System.out.println("start the work"+getClass().getName());
    }
    @PreDestroy
    public void EndWork(){
        System.out.println("end work" +getClass().getSimpleName());
    }
    @PreDestroy
    public void EndWork1(){
        System.out.println("end the work"+getClass().getName());
    }

}




