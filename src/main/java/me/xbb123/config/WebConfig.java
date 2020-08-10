package me.xbb123.config;

import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * HandlerMapping, HandlerAdapter, ExceptionHandler => WebMvcRegistrations
 *
 * @author xbb123
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Bean
    public HttpMessageConverters customConverters() {
        GsonHttpMessageConverter converter = new GsonHttpMessageConverter();
        return new HttpMessageConverters(converter);
    }
}