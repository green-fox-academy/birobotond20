package com.greenfoxacademy.frontend.model;

public class Greeting {

    private String welcomeMessage;

    public Greeting() {
    }
    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public void setWelcomeMessage(String name, String title) {
        this.welcomeMessage = "Oh, hi there " + name + ", my dear " + title + "!";
    }
}
