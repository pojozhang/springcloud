package sample.bookservice.integration;

import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import sample.bookservice.entity.User;

@Component
public class UserServiceClientFallbackFactory implements FallbackFactory<UserServiceClient> {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceClientFallbackFactory.class);

    @Override
    public UserServiceClient create(Throwable cause) {
        LOGGER.error("a fallback is triggered, cause: ", cause);
        return id -> new User(null, "unknown");
    }
}
