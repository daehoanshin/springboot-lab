package me.xbb123.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author xbb123
 */
@RestController
public class UserController {

    @Autowired
    HttpMessageConverters converters;

    /**
     *  "main" -> ViewResolver -> View -> ContentNegotiatingViewResolver -> View
     *
     * @return
    * */
    @RequestMapping("/")
    public @ResponseBody String index() {
        converters.getConverters().forEach(c -> System.out.println(";;;;;;;; " + c.getClass()));
        return "Hello Spring MVC";
    }

    @GetMapping("/user")
    public User currentUser() {
        User user = new User();
        user.setAge(20);
        user.setName("keesun");
        user.setHeight(175);
        return user;
    }
}
