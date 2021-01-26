package be.vdab.eindwerk.restcontrollers;

import be.vdab.eindwerk.model.Comment;
import be.vdab.eindwerk.model.Post;
import be.vdab.eindwerk.model.User;
import be.vdab.eindwerk.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/comments/")
@CrossOrigin(origins = "http://localhost:4200")
public class CommentRestController {

    @Autowired
    CommentService commentService;

    @GetMapping(value = {"findCommentsByUser"})
    public Iterable<Comment> getCommentsByUser(@RequestParam User user){
        return commentService.findCommentsByUser(user);
    }

    @GetMapping(value = {"findCommentsByParent"})
    public Iterable<Comment> getCommentsByParent(@RequestParam Post parent){
        return commentService.findCommentsByParent(parent);
    }

}
