package com.greenfoxacademy.redditapp.controller;

import com.greenfoxacademy.redditapp.model.Post;
import com.greenfoxacademy.redditapp.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {

    private PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping(value = {"", "/"})
    public String list() {
        return "redirect:/0/";
    }

    @GetMapping(value = "/{page}/")
    public String listPosts(Model model, @PathVariable(name = "page") Integer page) {
        model.addAttribute("posts", this.postService.getTenBestPosts(page));
        model.addAttribute("pageNumbers", this.postService.getNumberOfPages());
        return "index";
    }

    @GetMapping(value = "/add")
    public String addNewPostView(Model model) {
        model.addAttribute("newPost", new Post());
        return "submit_post";
    }

    @PostMapping(value = "/add")
    public String addNewPostSubmit(Post post) {
        this.postService.addNewPost(post);
        return "redirect:/";
    }

    @GetMapping(value = "/upVote/{id}")
    public String upVote(@PathVariable(name = "id") Long id) {
        this.postService.upVote(id);
        return "redirect:/0/";
    }

    @GetMapping(value = "/downVote/{id}")
    public String downVote(@PathVariable(name = "id") Long id) {
        this.postService.downVote(id);
        return "redirect:/0/";
    }
}