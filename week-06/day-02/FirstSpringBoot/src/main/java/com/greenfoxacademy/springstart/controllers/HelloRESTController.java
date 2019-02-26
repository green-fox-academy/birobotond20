package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

    @RequestMapping(value = "/greeting")
    public Greeting greet(@RequestParam(value = "name", required = false) String name) {

        if (name != null) {
            return new Greeting("Hello, " + name + "!");
        }
        return new Greeting("Hello, World!");
    }
}