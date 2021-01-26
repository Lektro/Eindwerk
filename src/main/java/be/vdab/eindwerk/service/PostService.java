package be.vdab.eindwerk.service;

import be.vdab.eindwerk.model.Post;
import org.springframework.stereotype.Service;

@Service
public interface PostService {
    Post save(Post post);
    Iterable<Post> getAllPosts();
    void deletePost(Post post);
    Iterable<Post> findPostsFromCategory(String category);
}

