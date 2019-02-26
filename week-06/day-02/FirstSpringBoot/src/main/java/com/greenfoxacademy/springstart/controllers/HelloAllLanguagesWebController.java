package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloAllLanguagesWebController {

    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag", "Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

    @RequestMapping(value = "/randomGreet")
    public String greet(Model model, @RequestParam(value="name", required = false) String name){
        String color = "rgb(" + (int)((Math.random() * 256)) +
                ", "  + (int)((Math.random() * 256)) +
                ", "  + (int)((Math.random() * 256)) + ") ";
        int fontSize = (int)(5 + (Math.random() * 40));
        model.addAttribute("color", color);
        model.addAttribute("fontSize", fontSize);
        model.addAttribute("greeting", hellos[(int)(Math.random() * hellos.length)]);
        if (name != null) {
            model.addAttribute("name", name);
        } else {
            model.addAttribute("name", "");
        }
        return "greet_randomly";
    }
}