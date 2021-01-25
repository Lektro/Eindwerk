package be.vdab.eindwerk.repository;

import be.vdab.eindwerk.model.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository <Post, Long> {
}
