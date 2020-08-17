package me.xbb123.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author xbb123
 */
@Configuration
public class MyWebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/bs").allowedOrigins("*");
    }

    //    @Override
//    public void addFormatters(FormatterRegistry registry) {
//        registry.addConverter(new BangsongConverter());
//    }
}
