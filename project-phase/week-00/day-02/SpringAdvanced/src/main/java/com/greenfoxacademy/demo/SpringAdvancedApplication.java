package com.greenfoxacademy.demo;

import com.greenfoxacademy.demo.models.User;
import com.greenfoxacademy.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAdvancedApplication implements CommandLineRunner {

    private UserService userService;

    @Autowired
    public SpringAdvancedApplication(UserService userService) {
        this.userService = userService;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringAdvancedApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        this.userService.registerUser(new User("jani","torta"));
        this.userService.registerUser(new User("almos","keksz"));
        this.userService.registerUser(new User("elemer","pilota"));
        this.userService.registerUser(new User("kata","secret"));
        this.userService.registerUser(new User("kati","secretPassword"));
        this.userService.registerUser(new User("bela","12345"));
        this.userService.registerUser(new User("joska","67890"));
        this.userService.registerUser(new User("pista","verySecretePassword"));
        this.userService.registerUser(new User("denes","almaKorte"));
        this.userService.registerUser(new User("rezso","Password"));
        this.userService.registerUser(new User("reka","1a2s3d4f4"));
        this.userService.registerUser(new User("istvan","hfalkds"));
        this.userService.registerUser(new User("repa","e8wjg"));
        this.userService.registerUser(new User("korte","jyierl5n"));
        this.userService.registerUser(new User("retek","vzdkv"));
        this.userService.registerUser(new User("mogyoro","ksjegnjsek"));
    }
}
