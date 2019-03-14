package com.greenfoxacademy.redditapp;

import com.greenfoxacademy.redditapp.model.Post;
import com.greenfoxacademy.redditapp.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditAppApplication implements CommandLineRunner {

    private PostRepository postRepository;

    @Autowired
    public RedditAppApplication(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(RedditAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        this.postRepository.deleteAll();
        this.postRepository.save(new Post("Google", "https://www.google.com"));
        this.postRepository.save(new Post("Facebook", "https://www.facebook.com"));
        this.postRepository.save(new Post("Green Fox Academy", "https://www.greenfoxacademy.com"));
    }
}
