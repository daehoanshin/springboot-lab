package me.xbb123.user;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author xbb123
 */
@RestController
public class UserFromController {
    @GetMapping("/users/new")
    public String newUserForm() {
        return "users/new";
    }

    @PostMapping("/user/new")
    public String newUser(@ModelAttribute @Valid User user, BindingResult error) {
        if (error.hasErrors()) {
            return "users/new";
        }
        // TODO add
        return "redirect:/users";
    }
}
