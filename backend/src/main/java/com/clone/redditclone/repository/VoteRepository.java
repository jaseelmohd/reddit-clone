package com.clone.redditclone.repository;

import com.clone.redditclone.model.Post;
import com.clone.redditclone.model.User;
import com.clone.redditclone.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
