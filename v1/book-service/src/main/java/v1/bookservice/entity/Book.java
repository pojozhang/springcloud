package v1.bookservice.entity;

public class Book {

    private Long id;
    private String name;
    private User author;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Book(Long id, String name, User author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public Book() {
    }
}
