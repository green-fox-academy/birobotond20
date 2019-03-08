package com.greenfox.programmerfoxclub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String loadMain(){
        return "index";
    }

    @GetMapping("/login")
    public String loadLogin(){
        return "login";
    }
}