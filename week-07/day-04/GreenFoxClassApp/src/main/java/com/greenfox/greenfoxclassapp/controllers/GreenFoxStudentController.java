package com.greenfox.greenfoxclassapp.controllers;

import com.greenfox.greenfoxclassapp.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreenFoxStudentController {

    private StudentService studentService;

    @Autowired
    public GreenFoxStudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping("/gfa")
    public String getMainPageRequest(){
        return "main_page";
    }

    @GetMapping("/gfa/list")
    public String listStudents(Model model){
        model.addAttribute("studentlist", this.studentService.findAll());
        return "student_list";
    }
}
