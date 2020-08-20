package me.xbb123.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xbb123
 */
@RestController
public class UserController {
    @GetMapping("/user")
    public User currentUser() {
        User user = new User();
        user.setAge(20);
        user.setName("dhshin");
        user.setHeight(180);
        return user;
    }
}
