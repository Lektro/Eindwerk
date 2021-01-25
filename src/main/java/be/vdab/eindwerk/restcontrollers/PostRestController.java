package be.vdab.eindwerk.restcontrollers;

import be.vdab.eindwerk.model.Post;
import be.vdab.eindwerk.service.PostServiceImpl;
import com.sun.istack.NotNull;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class PostRestController {

    private PostServiceImpl postService;

    public PostRestController (PostServiceImpl postService) { this.postService = postService; }

    @GetMapping(value = {"/posts"})
    public @NotNull
    Iterable<Post> getPosts() {
        return postService.getAllPosts();
    }


}
