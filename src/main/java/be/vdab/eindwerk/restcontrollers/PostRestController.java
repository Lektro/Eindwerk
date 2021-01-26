package be.vdab.eindwerk.restcontrollers;

import be.vdab.eindwerk.model.Post;
import be.vdab.eindwerk.model.User;
import be.vdab.eindwerk.service.PostServiceImpl;
import com.sun.istack.NotNull;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/posts/")
@CrossOrigin(origins = "http://localhost:4200")
public class PostRestController {

    private PostServiceImpl postService;

    public PostRestController (PostServiceImpl postService) { this.postService = postService; }

    @GetMapping(value = {"getAllPosts"})
    public @NotNull
    Iterable<Post> getPosts() {
        return postService.getAllPosts();
    }

    @PostMapping(value = {"deletePost"})
    public boolean deletePost(@RequestBody Post post){
        postService.deletePost(post);
        return true;
    }


    @PostMapping(value = {"addPost"})
    public boolean createPost(@RequestBody Post post){
        postService.save(post);
        return true;
    }

    @GetMapping(value = {"findPostsFromCategory"})
    public @NotNull Iterable<Post> findPostsFromCategory(@RequestParam String category){
        return postService.findPostsFromCategory(category);
    }


}
