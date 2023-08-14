package com.clone.redditclone.repository;

import com.clone.redditclone.model.Post;
import com.clone.redditclone.model.Subreddit;
import com.clone.redditclone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}
