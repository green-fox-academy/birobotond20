package com.greenfoxacademy.frontend.controller;

import com.greenfoxacademy.frontend.model.ErrorMessage;
import com.greenfoxacademy.frontend.model.Greeting;
import com.greenfoxacademy.frontend.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MainRestController {

    private MainService mainService;

    @Autowired
    public MainRestController(MainService mainService) {
        this.mainService = mainService;
    }

    @GetMapping(value = "/doubling")
    public Object doubleInput(@RequestParam(name = "input", required = false) Integer input) {
        if (input == null) {
            return new ErrorMessage("Please provide an input!");
        }
        return this.mainService.doubleInput(input);
    }

    @GetMapping(value = "/greeter")
    public Object greetSomeone(@RequestParam(name = "name", required = false) String name,
                               @RequestParam(value = "title", required = false) String title){
        if (name == null  &&  title == null){
            return new ErrorMessage("Please provide a name and a title!");
        } else if (name == null ){
            return new ErrorMessage("Please provide a name!");
        } else if (title == null){
            return new ErrorMessage("Please provide a title!");
        }
        Map<String, String> returnMessage = new HashMap<>();
        returnMessage.put("welcome_message", "Oh, hi there " + name + ", my dear " + title + "!");
        return returnMessage;
    }

    @GetMapping(value = "/appenda/{appendable}")
    public Object appendA(@PathVariable(value = "appendable") String appendable){
        Map<String, String> returnMessage = new HashMap<>();
        return returnMessage.put("appended", appendable + "a");
    }

    @PostMapping(value = "/dountil/{action}")
    public Object doUntil(@RequestBody(required = false) Map<String, Integer> until, @PathVariable(value = "action") String action){
        Map<String, Integer> returnMessage = new HashMap<>();
        if (until == null){
            return new ErrorMessage("Please provide a number!");
        }
        returnMessage.put("result", this.mainService.doAction(action, until.get("until")));
        return returnMessage;
    }
}
