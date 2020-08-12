package me.xbb123.springbootdaytemplates;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author xbb123
 */
@Controller
public class WebController {
    /**
     * ViewName (String) --> ViewResolver --> View (View)
     * @param model
     */
    @GetMapping("${index.path}")
    public String hello(Model model, @RequestParam(defaultValue = "whiteship") String name) {
        model.addAttribute("name", name);
        return "hello1";
    }


}
