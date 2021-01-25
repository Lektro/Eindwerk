package be.vdab.eindwerk.service;

import be.vdab.eindwerk.model.Post;
import org.springframework.stereotype.Service;

@Service
public interface PostService {
    Post save(Post post);
    Iterable<Post> getAllPosts();
}
