package be.vdab.eindwerk.restcontrollers;

import be.vdab.eindwerk.model.Post;
import be.vdab.eindwerk.model.User;
import be.vdab.eindwerk.service.PostServiceImpl;
import com.sun.istack.NotNull;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class PostRestController {

    private PostServiceImpl postService;

    public PostRestController (PostServiceImpl postService) { this.postService = postService; }

    @GetMapping(value = {"/posts/getAllPosts"})
    public @NotNull
    Iterable<Post> getPosts() {

        Iterable<Post> allPosts = postService.getAllPosts();
        System.out.println(allPosts);
        return allPosts;
    }

    @PostMapping(value = {"/posts/addPost"})
    public boolean createPost(@RequestBody Post post){
        System.out.println(post);
        postService.save(post);
        return true;
    }

}
