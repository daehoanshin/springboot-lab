package me.xbb123.book;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.reactive.config.ResourceHandlerRegistry;
import org.springframework.web.reactive.config.WebFluxConfigurer;

import java.util.concurrent.TimeUnit;

/**
 * @author xbb123
 */
@Configuration
public class MyWebFluxConfig implements WebFluxConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/my/**")
                .addResourceLocations("classpath:/my/")
                .setCacheControl(CacheControl.maxAge(100, TimeUnit.SECONDS));
    }
}
