package me.xbb123.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xbb123
 */
@Service
public class HelloService {

    @Autowired
    Xbb123Properties xbb123Properties;


    /**
     * -hello=Hello -hello=World => ["Hello", "World"] => Hello, World
     *
     * @return
     */
    public String getMessage() {
        return "Hello, " + xbb123Properties.getName() + " " + xbb123Properties.getList().size();
    }
//    @PostConstruct
//    public void init() {
//        throw new RuntimeException("Intended Exception");
//    }
}
