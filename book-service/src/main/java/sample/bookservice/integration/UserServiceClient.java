package sample.bookservice.integration;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import sample.bookservice.entity.User;

@FeignClient("user-service")
public interface UserServiceClient {

    @GetMapping("users/{id}")
    User getUser(@PathVariable Long id);
}
