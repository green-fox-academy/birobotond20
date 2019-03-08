package com.greenfox.programmerfoxclub.controllers;

import com.greenfox.programmerfoxclub.models.Fox;
import com.greenfox.programmerfoxclub.models.Gender;
import com.greenfox.programmerfoxclub.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class MainController {

    private FoxService foxService;

    @Autowired
    public MainController(FoxService foxService) {
        this.foxService = foxService;
    }

    @GetMapping("/")
    public String loadMain(Model model, @RequestParam(value = "name", required = false) String name) {
        if (this.foxService.isExistent(name)){
            model.addAttribute("fox", this.foxService.getFoxWithName(name));
        } else if (name != null && !name.isEmpty()) {
            this.foxService.addFox(new Fox(name));
            model.addAttribute("fox", new Fox(name));
        } else {
            model.addAttribute("fox", new Fox("Mr. Fox", Gender.MALE,
                    new ArrayList<String>(){{
                        add("write HTML");
                        add("code in Java");
                    }}, "pizza", "lemonade"));
        }
        model.addAttribute("foxlist", this.foxService.getFoxes());
        return "index";
    }

    @GetMapping("/login")
    public String loadLogin(Model model) {
        model.addAttribute("showText", true);
        return "login";
    }

    @PostMapping("/login")
    public String getLoginIndex(Model model, String name) {
        return "redirect:/?name=" + name;
    }
}