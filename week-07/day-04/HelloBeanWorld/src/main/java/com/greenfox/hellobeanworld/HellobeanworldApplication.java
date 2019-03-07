package com.greenfox.hellobeanworld;

import com.greenfox.hellobeanworld.model.MyColor;
import com.greenfox.hellobeanworld.model.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellobeanworldApplication implements CommandLineRunner {

    private MyColor myColor;

    @Autowired
    public HellobeanworldApplication(@Qualifier("Green Color") MyColor myColor) {
        this.myColor = myColor;
    }

    public static void main(String[] args) {
        SpringApplication.run(HellobeanworldApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        this.myColor.printColor();
    }
}
