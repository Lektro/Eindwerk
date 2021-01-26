package be.vdab.eindwerk.service;

import be.vdab.eindwerk.model.Comment;
import be.vdab.eindwerk.model.Post;
import be.vdab.eindwerk.model.User;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletionException;

@Service
public interface CommentService {

    void saveComment(Comment comment);
    void deleteComment(Comment comment);

    Iterable<Comment> findCommentsByParent(Post parent);
    Iterable<Comment> findCommentsByUser(User user);

}
