package sample.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sample.userservice.entity.User;

@RestController
@RequestMapping("users")
public class UserController {

    @GetMapping("{id}")
    public User getUser(@PathVariable Long id) {
        return new User(id, "Newton");
    }
}
