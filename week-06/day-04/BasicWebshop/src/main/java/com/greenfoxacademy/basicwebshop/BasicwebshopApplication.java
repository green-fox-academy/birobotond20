package com.greenfoxacademy.basicwebshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class BasicwebshopApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasicwebshopApplication.class, args);
    }

    @ResponseBody
    @RequestMapping(value = "/")
    public String helloWorld() {
        return "Hello World!";
    }
}