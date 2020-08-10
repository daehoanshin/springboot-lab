package me.xbb123.hello;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @author xbb123
 */
@Component
@Profile("dev")
public class DevBean implements MyBean {
    @Override
    public String getMessage() {
        return "Dev Bean";
    }
}
