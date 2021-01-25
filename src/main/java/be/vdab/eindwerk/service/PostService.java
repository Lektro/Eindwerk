package be.vdab.eindwerk.service;

import be.vdab.eindwerk.model.Post;
import org.springframework.stereotype.Service;

@Service
public interface PostService {
    Iterable<Post> getAllPosts();
    void createPost(Post post);
}
