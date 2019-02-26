package com.greenfoxacademy.springstart;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {

    private static AtomicLong countId = new AtomicLong(0);
    long id;
    String content;

    public Greeting(String content) {
        this.id = countId.incrementAndGet();
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
