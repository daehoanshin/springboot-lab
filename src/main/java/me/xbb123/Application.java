package me.xbb123;

import me.xbb123.hello.HelloService;
import me.xbb123.hello.MyPojo;
import me.xbb123.hello.Xbb123Properties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.core.env.PropertySource;
import org.springframework.core.env.AbstractEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MapPropertySource;


/**
 *
 *  SPRING_APPLICATION_JSON={"foo":"bar"}
 */
@SpringBootApplication
@RestController
public class Application {

    @Autowired
    HelloService helloService;

    @Autowired
    Environment environment;

    @Bean
    @ConfigurationProperties("xbb123")
    @Validated
    public Xbb123Properties xbb123Properties() {
        return new Xbb123Properties();
    }

    @RequestMapping("/")
    public String hello() {
        System.out.println(environment.getProperty("xbb123.list[0].name"));
        System.out.println(environment.getProperty("xbb123.name"));
        System.out.println(environment.getProperty("xbb123.work-for"));
        System.out.println(xbb123Properties().getWhereToGo());
        System.out.println(xbb123Properties().getTime1()); // 1000ms
        System.out.println(xbb123Properties().getTime2()); // 10h
        System.out.println(xbb123Properties().getTime3()); // 10s
        return helloService.getMessage();
    }

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Application.class);
        application.addListeners(new MyListener());
        application.run(args);
    }
}
