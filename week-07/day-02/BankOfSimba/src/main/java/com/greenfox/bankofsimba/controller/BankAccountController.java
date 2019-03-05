package com.greenfox.bankofsimba.controller;

import com.greenfox.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankAccountController {

    private BankAccount simbaBankAccount = new BankAccount("Simba", 2000, "lion", true, true);

    @GetMapping("/show")
    public String showAccount(Model model){
        model.addAttribute("bankaccount", simbaBankAccount);
        return "single_account";
    }

    @GetMapping("/html_text")
    public String displayHtmlText(Model model){
        model.addAttribute("emphasized_text", "<em>HTML</em>");
        model.addAttribute("bold_text", "<b>Enjoy yourself!</b>");
        return "htmlception";
    }
}
