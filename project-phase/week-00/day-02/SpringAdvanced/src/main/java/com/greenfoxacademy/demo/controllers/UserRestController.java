package com.greenfoxacademy.demo.controllers;

import com.greenfoxacademy.demo.models.User;
import com.greenfoxacademy.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserRestController {

    private UserService userService;

    @Autowired
    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/")
    public Object returnGreetMessage() {
        return "Hello. This is your greeting! Never get old!";
    }

    @PostMapping(path = "/user/add")
    public Object saveUser(@RequestBody User newUser) {
        Map<String, String> returnMessage = new HashMap<>();
        if (newUser == null) {
            returnMessage.put("message", "No User object received");
            return new ResponseEntity(returnMessage, null, HttpStatus.NOT_ACCEPTABLE);
        }
        this.userService.saveNewUser(newUser);
        returnMessage.put("message", this.userService.saveMessage);
        return returnMessage;
    }
}
