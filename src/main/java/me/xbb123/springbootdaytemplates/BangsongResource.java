package me.xbb123.springbootdaytemplates;

import org.springframework.hateoas.ResourceSupport;

/**
 * @author xbb123
 */
public class BangsongResource extends ResourceSupport {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
