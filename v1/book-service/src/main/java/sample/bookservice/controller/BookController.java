package sample.bookservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import sample.bookservice.entity.Book;
import sample.bookservice.entity.User;
import sample.bookservice.integration.UserServiceClient;

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
