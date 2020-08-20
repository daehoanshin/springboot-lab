package me.xbb123.springbootdaytemplates;

import org.junit.Test;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;

/**
 * @author xbb123
 */

public class WebControllerTest {

    @Test
    public void helloTest() {
        // Given
        WebController webController = new WebController();
        Model model = new ExtendedModelMap();

        // When
        webController.hello(model, "dhshin");

        // Then
        model.asMap().forEach((k, v) -> System.out.println("key: " + k + " value: " + v));
    }
}
