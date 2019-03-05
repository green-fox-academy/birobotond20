package com.greenfox.bankofsimba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankAccountController {

    @GetMapping("/show")
    public String showAccount(){
        return "template";
    }
}
