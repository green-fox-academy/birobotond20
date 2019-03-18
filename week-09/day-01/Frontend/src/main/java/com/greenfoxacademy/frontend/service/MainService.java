package com.greenfoxacademy.frontend.service;

import org.springframework.stereotype.Service;

@Service
public class MainService {

    public int doubleInput(int input){
        return input * 2;
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
