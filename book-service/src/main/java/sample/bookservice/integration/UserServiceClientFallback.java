package sample.bookservice.integration;

import org.springframework.stereotype.Component;
import sample.bookservice.entity.User;

@Component
public class UserServiceClientFallback implements UserServiceClient {

    @Override
    public User getUser(Long id) {
        User user = new User();
        user.setName("unknown");
        return user;
    }
}
