package com.clone.redditclone.repository;

import com.clone.redditclone.model.Comment;
import com.clone.redditclone.model.Post;
import com.clone.redditclone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long>{
    List<Comment> findByPos(Post post);

    List<Comment> findAllByUser(User user);
}
