package com.example.demo.controller;

import com.example.demo.entity.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MyController {
    @GetMapping("/mypage")
    public String displayPage(Model model) {
        Student student=new Student();
        model.addAttribute("rollno","1001");
        model.addAttribute("address","shyamnagar");
        model.addAttribute("city","amaravati");
        model.addAttribute("name","maithili");
        return "mypage";
    }

    @GetMapping("/myform")
   public String myMethod() {

        return "maithili";
   }

    @GetMapping("/displayvalue")
  public String processData(HttpServletRequest request,Model model){
       String rollno =request.getParameter("rollno") ;
        String address =request.getParameter("address") ;
       String city =request.getParameter("city") ;
       String name =request.getParameter("name") ;

       model.addAttribute("rollno",1001);
        model.addAttribute("address","shyamnagar");
      model.addAttribute("city","amaravati");
       model.addAttribute("name","maithili");
       return "displaypage";

   }
}
