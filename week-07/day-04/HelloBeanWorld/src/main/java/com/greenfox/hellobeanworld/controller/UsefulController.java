package com.greenfox.hellobeanworld.controller;

import com.greenfox.hellobeanworld.model.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.jws.WebParam;

@Controller
public class UsefulController {

    private UtilityService utilities;

    @Autowired
    public UsefulController(UtilityService utilities){
        this.utilities = utilities;
    }

    @GetMapping("/useful")
    public String displayUtilities(Model model){
        model.addAttribute("listOfColors", this.utilities.getColorList());
        return "links_to_utilities";
    }

    @GetMapping("/useful/colored")
    public String setRandomBackgroundColor(Model model){
        model.addAttribute("color", this.utilities);
        return "random_background";
    }

    @GetMapping("/useful/email")
    public String showInputField(){
        return "email_validated";
    }

    @PostMapping("/useful/email")
    public String emailValidator(Model model, @RequestParam("email") String email){
        model.addAttribute("isValid", this.utilities.validateEmail(email));
        model.addAttribute("emailAddress", email);
        return "email_validated";
    }

    @GetMapping("/encode")
    public String showEncodeInputFields(){
        return "caesar";
    }

    @GetMapping("/decode")
    public String showDecodeInputFields(){
        return "caesar";
    }

    @PostMapping("/encode")
    public String caeserEncode(Model model, @RequestParam("text") String text, @RequestParam("number") int shifts){
        model.addAttribute("returnedText", this.utilities.caesar(text, shifts));
        return "caesar";
    }

    @PostMapping("/decode")
    public String caeserDecode(Model model, @RequestParam("text") String text, @RequestParam("number") int shifts){
        model.addAttribute("returnedText", this.utilities.caesar(text, -shifts));
        return "caesar";
    }
}