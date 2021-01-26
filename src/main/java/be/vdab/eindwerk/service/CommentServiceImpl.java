package be.vdab.eindwerk.service;

import be.vdab.eindwerk.model.Comment;
import be.vdab.eindwerk.model.Post;
import be.vdab.eindwerk.model.User;
import be.vdab.eindwerk.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.concurrent.CompletionException;

@Service
@Transactional
public class CommentServiceImpl implements CommentService {

    @Autowired
    CommentRepository commentRepository;

    @Override
    public void saveComment(Comment comment) {
        commentRepository.save(comment);
    }

    @Override
    public void deleteComment(Comment comment) {
        commentRepository.delete(comment);
    }

    @Override
    public Iterable<Comment> findCommentsByParent(Post parent) {
        // TODO: use criteria builder to find comments with parent 'object'
        return new ArrayList<Comment>();
    }

    @Override
    public Iterable<Comment> findCommentsByUser(User user) {
        // TODO: use criteria builder to find comments by user
        return new ArrayList<Comment>();
    }
}
