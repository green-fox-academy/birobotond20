package com.greenfoxacademy.frontend.service;

import com.greenfoxacademy.frontend.model.Doubler;
import com.greenfoxacademy.frontend.model.ErrorMessage;
import com.greenfoxacademy.frontend.model.Greeting;
import org.springframework.stereotype.Service;

@Service
public class MainService {

    public Doubler doubleInput(int input){
        Doubler doubler = new Doubler();
        doubler.setReceived(input);
        doubler.setResult(input * 2);
        return doubler;
    }

    public Greeting greeting(String name, String title){
        Greeting greeting = new Greeting();
        greeting.setWelcomeMessage(name, title);
        return greeting;
    }

    public int doAction(String action, int until){
        int result = 0;
        if (action.equals("sum")) {
            for (int i = 0; i <= until; i++) {
                result += i;
            }
        } else if (action.equals("factor")){
            result = 1;
            for (int i = 1; i <= until; i++) {
                result *= i;
            }
        }
        return result;
    }
}
