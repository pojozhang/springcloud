package v2.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import v2.userservice.entity.User;
import v2.userservice.feign.BookFeign;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private BookFeign bookFeign;

    @GetMapping("{id}")
    public User getUser(@PathVariable Long id) {
        bookFeign.getBook(id);
        return new User(id, "Newton");
    }
}
