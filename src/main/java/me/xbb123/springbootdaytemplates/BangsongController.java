package me.xbb123.springbootdaytemplates;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author xbb123
 */
@RestController
public class BangsongController {

    @GetMapping("bs/{id}")
    public Bangsong getBangSon(@PathVariable("id") Bangsong bangsong) {
        if(bangsong.getId() == 100) {
            throw new BangsongException();
        }
        return bangsong;
    }
}
