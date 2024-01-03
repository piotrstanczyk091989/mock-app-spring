package pl.javaps.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.javaps.model.User;
import pl.javaps.service.UserService;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/users/active")
    public List<User> getActiveUsers() {
        return userService.getActiveUsers();
    }

    @GetMapping("/users/superusers")
    public List<User> getInactiveUsers() {
        return userService.getActiveSuperUsers();
    }


}
