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
    public String listPosts(Model model) {
        model.addAttribute("posts", this.postService.getTenBestPosts());
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

    @GetMapping(value = "/{id}/upvote")
    public String upvote(@PathVariable(name = "id") Long id) {
        this.postService.upVote(id);
        return "redirect:/";
    }

    @GetMapping(value = "/{id}/downvote")
    public String downvote(@PathVariable(name = "id") Long id) {
        this.postService.downVote(id);
        return "redirect:/";
    }

    @GetMapping(value = "listAll")
    public String listAll(Model model) {
        model.addAttribute("posts", this.postService.listAllPosts());
        return "index";
    }

    @GetMapping(value = "orderPosts")
    public String orderPosts(Model model) {
        model.addAttribute("posts", this.postService.getPostsOrdered());
        return "index";
    }
}