package me.xbb123.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author xbb123
 */
@Service
public class HelloService {

    @Autowired
    ApplicationArguments arguments;

//    @Value("${hello}")
//    String[] helloValues;
//
//    @Value("${foo}")
//    String fooValue;

    /**
    * -hello=Hello -hello=World => ["Hello", "World"] => Hello, World
    * @return
    *
    * */
    public String getMessage() {
//        List<String> helloValues = arguments.getOptionValues("hello");
//        String collect = Arrays.stream(helloValues).collect(Collectors.joining(","));
//        collect += " " + fooValue;
        return "Hello World";
//        return "Hello Spring Boot2.0";
    }
//    @PostConstruct
//    public void init() {
//        throw new RuntimeException("Intended Exception");
//    }
}
