package me.xbb123.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Service;

/**
 * @author xbb123
 */
@Service
public class HelloService {

    @Autowired
    ApplicationArguments arguments;

    @Value("${xbb123.name}")
    String name;
//
//    @Value("${foo}")
//    String fooValue;

    /**
     * -hello=Hello -hello=World => ["Hello", "World"] => Hello, World
     *
     * @return
     */
    public String getMessage() {
//        List<String> helloValues = arguments.getOptionValues("hello");
//        String collect = Arrays.stream(helloValues).collect(Collectors.joining(","));
//        collect += " " + fooValue;
        return "Hello, " + name;
    }
//    @PostConstruct
//    public void init() {
//        throw new RuntimeException("Intended Exception");
//    }
}
