package v1.bookservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import v1.bookservice.entity.Book;
import v1.bookservice.entity.User;
import v1.bookservice.integration.UserServiceClient;

@RestController
public class BookController {

    @Autowired
    private UserServiceClient userServiceClient;

    @GetMapping(path = "books/{id}")
    public Book getBook(@PathVariable Long id) {
        User author = userServiceClient.getUser(1L);
        return new Book(id, "book", author);
    }
}
