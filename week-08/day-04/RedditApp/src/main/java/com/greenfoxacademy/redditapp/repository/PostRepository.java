package com.greenfoxacademy.redditapp.repository;

import com.greenfoxacademy.redditapp.model.Post;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    @Query("SELECT p FROM Post p ORDER BY numberOfVotes DESC")
    Iterable<Post> getPostsOrdered();

    List<Post> findAllByOrderByNumberOfVotesDesc(Pageable pageable);
}
