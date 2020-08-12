package me.xbb123.springbootdaytemplates;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xbb123
 */
@RestController
public class BangsongController {

    @GetMapping("bs/{id}")
    public Bangsong getBangSon(@PathVariable("id") Bangsong bangsong) {
        return bangsong;
    }
}
