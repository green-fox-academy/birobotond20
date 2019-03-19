package com.greenfoxacademy.frontend.controller;

import com.greenfoxacademy.frontend.model.ErrorMessage;
import com.greenfoxacademy.frontend.model.Json;
import com.greenfoxacademy.frontend.model.LogEntry;
import com.greenfoxacademy.frontend.service.LogEntryService;
import com.greenfoxacademy.frontend.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RestController
public class MainRestController {

    private MainService mainService;
    private LogEntryService logEntryService;

    @Autowired
    public MainRestController(MainService mainService, LogEntryService logEntryService) {
        this.mainService = mainService;
        this.logEntryService = logEntryService;
    }

    @GetMapping(value = "/doubling")
    public Object doubleInput(@RequestParam(name = "input", required = false) Integer input) {
        Map<String, Integer> returnMessage = new HashMap<>();
        if (input == null) {
            this.logEntryService.saveLogEntry(new LogEntry("/doubling",
                    "input: no input received"));
            return new ErrorMessage("Please provide an input!");
        }
        returnMessage.put("received", input);
        returnMessage.put("result", this.mainService.doubleInput(input));
        this.logEntryService.saveLogEntry(new LogEntry("/doubling", "input: " + input));
        return returnMessage;
    }

    @GetMapping(value = "/greeter")
    public Object greetSomeone(@RequestParam(name = "name", required = false) String name,
                               @RequestParam(value = "title", required = false) String title){
        if (name == null  &&  title == null){
            this.logEntryService.saveLogEntry(new LogEntry("/greeter",
                    "no name and title received"));
            return new ErrorMessage("Please provide a name and a title!");
        } else if (name == null ){
            this.logEntryService.saveLogEntry(new LogEntry("/greeter",
                    "name: no name received" + "; title: " + title));
            return new ErrorMessage("Please provide a name!");
        } else if (title == null){
            this.logEntryService.saveLogEntry(new LogEntry("/greeter",
                    "name: " + name + "; title: no title received"));
            return new ErrorMessage("Please provide a title!");
        }
        Map<String, String> returnMessage = new HashMap<>();
        returnMessage.put("welcome_message", "Oh, hi there " + name + ", my dear " + title + "!");
        this.logEntryService.saveLogEntry(new LogEntry("/greeter",
                "name: " + name + "; title: " + title));
        return returnMessage;
    }

    @GetMapping(value = "/appenda/{appendable}")
    public Object appendA(@PathVariable(value = "appendable") String appendable){
        Map<String, String> returnMessage = new HashMap<>();
        returnMessage.put("appended", appendable + "a");
        this.logEntryService.saveLogEntry(new LogEntry("/appenda/", "appendable: " + appendable));
        return returnMessage;
    }

    @PostMapping(value = "/dountil/{action}")
    public Object doUntil(@RequestBody(required = false) Map<String, Integer> until, @PathVariable(value = "action") String action){
        Map<String, Integer> returnMessage = new HashMap<>();
        if (until == null){
            this.logEntryService.saveLogEntry(new LogEntry("/dountil/",
                    "action: " + action + "; until: no value received"));
            return new ErrorMessage("Please provide a number!");
        }
        this.logEntryService.saveLogEntry(new LogEntry("/dountil/",
                "action: " + action + "; until: " + until.get("until")));
        returnMessage.put("result", this.mainService.doAction(action, until.get("until")));
        return returnMessage;
    }

    @PostMapping(value = "/arrays")
    public Object processArraysAsGiven(@RequestBody(required = false) Json json){
        if (json.getWhat() == null || json.getNumbers() == null){
            this.logEntryService.saveLogEntry(new LogEntry("/arrays",
                    "action: " + json.getWhat() + "; numbers: " + Arrays.toString(json.getNumbers())));
            return new ErrorMessage("Please provide what to do with the numbers!");
        }

        Map<String, Object> returnMessage = new HashMap<>();
        returnMessage.put("result", this.mainService.doOneAction(json.getWhat(), json.getNumbers()));
        this.logEntryService.saveLogEntry(new LogEntry("/arrays",
                "action: " + json.getWhat() + "; numbers: " + Arrays.toString(json.getNumbers())));
        return returnMessage;
    }

    @GetMapping(value = "/log")
    public Object findAllLogEntries(){
        /*this.logEntryService.saveLogEntry(new LogEntry("/log", null));*/
        Map<String, Object> returnMessage = new HashMap<>();
        returnMessage.put("entries", this.logEntryService.findAllLogEntries());
        returnMessage.put("entry_count", this.logEntryService.findAllLogEntries().size());
        return returnMessage;
    }
}
