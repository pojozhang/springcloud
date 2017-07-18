package sample.bookservice.integration;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import sample.bookservice.entity.User;

/**
 * To enable fallbackFactory, you should set feign.hystrix.enabled: true, or it won't work as expected.
 */
@FeignClient(
    value = "user-service",
    fallbackFactory = UserServiceClientFallbackFactory.class
    /*fallback = UserServiceClientFallback.class*/)
public interface UserServiceClient {

    @GetMapping("users/{id}")
    User getUser(@PathVariable("id") Long id);
}
