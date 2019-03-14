package com.greenfoxacademy.redditapp.controller;

import com.greenfoxacademy.redditapp.model.Post;
import com.greenfoxacademy.redditapp.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {

    private PostService postService;

    private List<Post> postList = new ArrayList<>();

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
        this.postList.add(new Post("Google", "https://www.google.com"));
        this.postList.add(new Post("Facebok", "https://www.facebook.com"));
        this.postList.add(new Post("Green Fox Academy", "https://www.greenfoxacademy.com"));
    }

    @GetMapping(value = {"", "/"})
    public String listPosts(Model model){
        model.addAttribute("posts", this.postList);
        return "index";
    }

    @GetMapping(value = "/add")
    public String addNewPostView(Model model){
        model.addAttribute("newPost", new Post());
        return "submit_post";
    }

    @PostMapping(value = "/add")
    public String addNewPostSubmit(Post post){
        if (post != null && !post.getTitle().isEmpty()) {
            if (post.getUrl().isEmpty()){
                post.setUrl("https://www.google.com/search?q=" + post.getTitle());
            }
            this.postList.add(post);
        }
        return "redirect:/";
    }
}
