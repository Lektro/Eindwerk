package be.vdab.eindwerk.service;

import be.vdab.eindwerk.model.Post;
import be.vdab.eindwerk.model.User;
import be.vdab.eindwerk.repository.PostRepository;
import be.vdab.eindwerk.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PostRepository postRepository;



    @Override
    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User findUserByID(long id) {
        Optional<User> userOptional = userRepository.findById(id);
        return userOptional.orElse(null);
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUser(User user){
        // TODO: use criteria builder to find all posts from user
        // collapse assignment into method
        List<Post> posts = new ArrayList<>();
        postRepository.deleteAll(posts);
        // will only succeed if no posts are linked to user
        userRepository.delete(user);
    }

    public boolean validateUser(User user){
        // TODO: use criteria builder to find user with username
        User dbUser = new User();
        if(dbUser == null){ //test if user with username exists
            return false;
        }
        // compare passwords
        return user.getPassword().equals(dbUser.getPassword());
    }

}
