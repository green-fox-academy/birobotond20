package com.greenfoxacademy.frontend.model;

public class Doubler {

    private int received;
    private int result;

    public Doubler() {
    }

    public Doubler(int received, int result) {
        this.received = received;
        this.result = result;
    }

    public int getReceived() {
        return this.received;
    }

    public void setReceived(int received) {
        this.received = received;
    }

    public int getResult() {
        return this.result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}