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
        this.postRepository.save(new Post("kutya", "https://www.google.com/search?q=kutya"));
        this.postRepository.save(new Post("macska", "https://www.google.com/search?q=macska"));
        this.postRepository.save(new Post("mokus", "https://www.google.com/search?q=mokus"));
        this.postRepository.save(new Post("laptop", "https://www.google.com/search?q=laptop"));
        this.postRepository.save(new Post("pohar", "https://www.google.com/search?q=pohar"));
        this.postRepository.save(new Post("asztal", "https://www.google.com/search?q=asztal"));
        this.postRepository.save(new Post("telefon", "https://www.google.com/search?q=telefon"));
        this.postRepository.save(new Post("golyóstoll", "https://www.google.com/search?q=golyóstoll"));
        this.postRepository.save(new Post("elem", "https://www.google.com/search?q=elem"));
        this.postRepository.save(new Post("Elemér", "https://www.google.com/search?q=Elemér"));
        this.postRepository.save(new Post("Ágnes", "https://www.google.com/search?q=Ágnes"));
    }
}
