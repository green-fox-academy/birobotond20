package com.greenfoxacademy.frontend.service;

import org.springframework.stereotype.Service;

@Service
public class MainService {

    public int doubleInput(int input) {
        return input * 2;
    }

    public int doAction(String action, int until) {
        int result = 0;
        if (action.equals("sum")) {
            for (int i = 0; i <= until; i++) {
                result += i;
            }
        } else if (action.equals("factor")) {
            result = 1;
            for (int i = 1; i <= until; i++) {
                result *= i;
            }
        }
        return result;
    }

    public Object doOneAction(String action, int[] array) {
        int result = 0;
        if (action.equals("sum")) {
            for (Integer integer : array) {
                result += integer;
            }
        } else if (action.equals("multiply")) {
            result = 1;
            for (int i = 1; i < array.length; i++) {
                result *= array[i];
            }
        } else if (action.equals("double")) {
            for (int i = 0; i < array.length; i++) {
                array[i] = array[i] * 2;
            }
            return array;
        }
        return result;
    }
}
