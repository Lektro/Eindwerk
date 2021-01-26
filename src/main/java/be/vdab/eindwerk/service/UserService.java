package be.vdab.eindwerk.service;

import be.vdab.eindwerk.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    Iterable<User> getAllUsers();
    User findUserByID(long id);
    void saveUser(User user);
    void deleteUser(User user);
    boolean validateUser(User user);
}
