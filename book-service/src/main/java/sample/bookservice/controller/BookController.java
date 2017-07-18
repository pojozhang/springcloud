package sample.bookservice.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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

    @HystrixCommand(fallbackMethod = "getBookFallback")
    @GetMapping(path = "books/{id}")
    public Book getBook(@PathVariable Long id) {
        User author = userServiceClient.getUser(1L);
        return new Book(id, "book", author);
    }

    private Book getBookFallback(Long id) {
        return new Book(id, "unknown", null);
    }
}
