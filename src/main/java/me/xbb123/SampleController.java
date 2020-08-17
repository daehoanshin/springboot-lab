package me.xbb123;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xbb123
 */
public class SampleController {
    private Logger logger = LoggerFactory.getLogger(SampleController.class);
    @Autowired
    SampleService sampleService;

    @GetMapping("/foo1")
    public String foo() {
        logger.info("Hello World");
        return sampleService.getName();
    }
}
