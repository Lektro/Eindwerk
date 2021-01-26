package be.vdab.eindwerk.restcontrollers;

import be.vdab.eindwerk.model.Post;
import be.vdab.eindwerk.model.User;
import be.vdab.eindwerk.service.PostServiceImpl;
import be.vdab.eindwerk.service.UserServiceImpl;
import com.sun.istack.NotNull;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping("post/add")
    public void createPost(@RequestBody Post post) {
        postService.createPost(post);
    }

    @RequestMapping("user/add")
    public void createUser(@RequestBody User user) {
        userService.createUser(user);
    }
}
