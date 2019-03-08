package com.greenfox.programmerfoxclub.controllers;

import com.greenfox.programmerfoxclub.models.Fox;
import com.greenfox.programmerfoxclub.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private FoxService foxService;

    @Autowired
    public MainController(FoxService foxService) {
        this.foxService = foxService;
    }

    @GetMapping("/")
    public String loadMain(Model model, @RequestParam(value = "name", required = false, defaultValue = "Mr. Fox") String name) {
        model.addAttribute("name", name);
        return "index";
    }

    @GetMapping("/login")
    public String loadLogin() {
        return "login";
    }

    /*
     * If there is no @ResponseBody annotation in the method parameters, just "getLoginName(String name)"
     * then the Strings name must be the same as the name given for the form's input field name:
     *   <input name="name" type="text">
     *
     * If there is a @ResponseBody annotation in the method parameters
     * "getLoginName(@ResponseBody String name)" then the we should use a Map for the incoming data like
     * "getLoginName(@ResponseBody Map name)"
     */

    // Do not touch this code, it just happens to work
    @PostMapping("/login")
    public String getLoginName(Model model, String name) {
        if (!this.foxService.isExistent(name)){
            return "/login";
        }
        return "redirect:/?name=" + name;
    }
}