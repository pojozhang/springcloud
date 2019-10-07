package v2.userservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "book-service")
public interface BookFeign {

    @GetMapping("books/{id}")
    void getBook(@PathVariable("id") long id);
}
