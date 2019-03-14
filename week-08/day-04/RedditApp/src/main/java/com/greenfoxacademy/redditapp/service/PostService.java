package com.greenfoxacademy.redditapp.service;

import com.greenfoxacademy.redditapp.model.Post;
import com.greenfoxacademy.redditapp.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    private PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> listAllPosts(){
        return (List<Post>) this.postRepository.findAll();
    }

    public void addNewPost(Post post){
        if (post != null && !post.getTitle().isEmpty()) {
            if (post.getUrl().isEmpty()){
                post.setUrl("https://www.google.com/search?q=" + post.getTitle());
            }
            this.postRepository.save(post);
        }
    }

    public void upVote(long id){
        Optional<Post> optionalPost = this.postRepository.findById(id);
        if (optionalPost.isPresent()){
            Post post = optionalPost.get();
            post.setNumberOfVotes(1);
            this.postRepository.save(post);
        }
    }

    public void downVote(long id){
        Optional<Post> optionalPost = this.postRepository.findById(id);
        if (optionalPost.isPresent()){
            Post post = optionalPost.get();
            if (post.getNumberOfVotes() > 0) {
                post.setNumberOfVotes(-1);
            }
            this.postRepository.save(post);
        }
    }
}
