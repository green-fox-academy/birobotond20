package com.greenfox.bankofsimba.controller;

import com.greenfox.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class BankAccountController {

    BankAccount simbaBankAccount = new BankAccount("Simba", 2000, "lion");

    @GetMapping("/show")
    public String showAccount(Model model){
        model.addAttribute("bankaccount", simbaBankAccount);
        return "base_template";
    }

    @GetMapping("/html_text")
    public String displayHtmlText(@ModelAttribute)
}
