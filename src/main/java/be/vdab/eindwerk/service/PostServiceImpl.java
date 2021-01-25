package be.vdab.eindwerk.service;

import be.vdab.eindwerk.model.Post;
import be.vdab.eindwerk.repository.PostRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PostServiceImpl implements PostService{
    private final PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {this.postRepository = postRepository; }
    @Override
    public Post save(Post post) {
        return postRepository.save(post);
    }

    @Override
    public Iterable<Post> getAllPosts() {
        return postRepository.findAll();
    }

    @Override
    public void deletePost(Post post){ postRepository.delete(post);}
}
