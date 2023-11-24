package com.example.project.config;

import com.example.project.rest.Student;
import com.example.project.rest.StudentInformation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuration1 {
    @Bean
    public Student studentInformation() {
        return new StudentInformation();


    }
}
