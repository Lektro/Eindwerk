package be.vdab.eindwerk.restcontrollers;

import be.vdab.eindwerk.model.Post;
import be.vdab.eindwerk.service.PostServiceImpl;
import com.sun.istack.NotNull;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class PostRestController {

    private PostServiceImpl postService;

    public PostRestController (PostServiceImpl postService) { this.postService = postService; }

    @GetMapping(value = {"/posts"})
    public @NotNull
    Iterable<Post> getPosts() {

        Iterable<Post> allPosts = postService.getAllPosts();
        System.out.println(allPosts);
        return allPosts; }

    @DeleteMapping("/posts/{id}")
    public void deletePost(@PathVariable Long id) {
        postService.deleteById(id);
    }

    @PostMapping(value = {"/posts"})
    public Post createPost(@RequestBody Post post) { return postService.save(post);
    }

}
