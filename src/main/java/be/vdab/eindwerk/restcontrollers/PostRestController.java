package be.vdab.eindwerk.restcontrollers;

import be.vdab.eindwerk.model.Post;
import be.vdab.eindwerk.model.User;
import be.vdab.eindwerk.service.PostServiceImpl;
import be.vdab.eindwerk.service.UserServiceImpl;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class PostRestController {
    @Autowired
    private PostServiceImpl postService;

    @Autowired
    private UserServiceImpl userService;

    public PostRestController () { }

    @GetMapping(value = {"/posts"})
    public @NotNull
    Iterable<Post> getPosts() {
        Iterable<Post> allPosts = postService.getAllPosts();
        System.out.println(allPosts);
        return allPosts;
    }

    @RequestMapping("post/add")
    public void createPost(@RequestBody Post post) {
        postService.createPost(post);
    }

    @RequestMapping("user/add")
    public void createUser(@RequestBody User user) {
        userService.createUser(user);
    }
}
