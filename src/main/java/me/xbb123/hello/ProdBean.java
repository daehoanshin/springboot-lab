package me.xbb123.hello;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @author xbb123
 */
@Component
@Profile("prod")
public class ProdBean implements MyBean {
    @Override
    public String getMessage() {
        return "Prod Bean";
    }
}
