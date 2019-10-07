package v2.bookservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import v2.bookservice.entity.Book;

@RestController
@RequestMapping("books")
public class BookController {

    @GetMapping("{id}")
    public Book getBook(@PathVariable Long id) {
        return new Book(id, "Newton");
    }
}
