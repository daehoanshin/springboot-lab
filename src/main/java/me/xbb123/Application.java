package me.xbb123;

import me.xbb123.hello.HelloService;
import me.xbb123.hello.MyBean;
import me.xbb123.hello.Xbb123Properties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.core.env.StandardEnvironment;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


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
    MyBean myBean;

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
        System.out.println(myBean.getMessage());
        return helloService.getMessage();
    }

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Application.class);
        ConfigurableEnvironment env = new StandardEnvironment();
        env.setActiveProfiles("prod");
        application.addListeners(new MyListener());
        application.run(args);
    }
}
