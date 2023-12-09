package com.example.curdoperation.service;

import com.example.curdoperation.entity.Student;
import com.example.curdoperation.repository.StudentRepositoryJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Service
public class StudentServiceIRepositoryImpl implements StudentService {
    private StudentRepositoryJpa repositoryJPA;
    @Autowired
        public StudentServiceIRepositoryImpl(StudentRepositoryJpa repositoryJPA) {
            this.repositoryJPA = repositoryJPA;
        }
       @Override
       public List<Student> findAll() {
           return repositoryJPA.findAll();
        }

   // @Override
   // public void save(@ModelAttribute("student") Student student) {
     //    repositoryJPA.save(student);
    }

   // }






