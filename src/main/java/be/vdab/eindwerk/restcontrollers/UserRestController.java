package be.vdab.eindwerk.restcontrollers;

import be.vdab.eindwerk.model.User;
import be.vdab.eindwerk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users/")
@CrossOrigin(origins = "http://localhost:4200")
public class UserRestController {

    @Autowired
    UserService userService;

    @GetMapping(value={"getAllUsers"})
    public Iterable<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping(value={"findUserByID"})
    public User findUserByID(@RequestParam long id){
        return userService.findUserByID(id);
    }

    @PostMapping(value = {"saveUser"})
    public boolean saveUser(@RequestBody User user){
        userService.saveUser(user);
        return true;
    }

    @PostMapping(value = {"deleteUser"})
    public boolean deleteUser(@RequestBody User user){
        //TODO: only works on users without posts
        userService.deleteUser(user);
        return true;
    }

    @GetMapping(value = {"validateUser"})
    public boolean validateUser(@RequestParam User user){
        return userService.validateUser(user);
    }


}
