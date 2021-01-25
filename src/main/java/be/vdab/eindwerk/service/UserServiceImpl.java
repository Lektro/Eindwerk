package be.vdab.eindwerk.service;

import be.vdab.eindwerk.model.User;
import be.vdab.eindwerk.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {this.userRepository = userRepository; }

    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }
}
