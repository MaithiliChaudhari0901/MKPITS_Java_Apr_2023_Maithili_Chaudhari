package com.example.curdoperation.rest;
import com.example.curdoperation.entity.Student;
import com.example.curdoperation.service.StudentServiceIRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequestMapping("/students")
    public class MyRestController {
    private StudentServiceIRepositoryImpl studentServiceIRepository;

    @Autowired
    public MyRestController(StudentServiceIRepositoryImpl studentServiceIRepository) {
        this.studentServiceIRepository = studentServiceIRepository;
    }

    @GetMapping("/list")
    public String getStudents(Model model) {
        List<Student> list = studentServiceIRepository.findAll();
        model.addAttribute("students", list);
        return "maithili";
    }

    @PostMapping("/save")
    public String myMethod(@ModelAttribute("stud") Student student) {
        studentServiceIRepository.save(student);
        return "redirect:/students/list";
    }

    @GetMapping("/display")
    public String displayMethod(Model model) {
        Student student = new Student();
        model.addAttribute("stud", student);
        return "hello";
    }
    @GetMapping("/demo")
    public String demoMethod(){
        return "demo";
    }
}











