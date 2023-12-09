package com.example.curdoperation.rest;
import com.example.curdoperation.entity.Student;
import com.example.curdoperation.service.StudentServiceIRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

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
        model.addAttribute("students",list);
        return "maithili";
    }

//        @GetMapping("/save")
//        public String myMethod(@ModelAttribute("stud") Student student){
//        studentServiceIRepository.save(student);
//        return "redirect:/students/list";
//        }
//}





