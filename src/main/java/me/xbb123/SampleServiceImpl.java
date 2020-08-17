package me.xbb123;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author xbb123
 */
//@Service("sampleService")
public class SampleServiceImpl implements SampleService {
    RestTemplate restTemplate;

    public SampleServiceImpl(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }

    public String getName() {
//        return restTemplate.getForEntity("/foo", String.class).getBody();
        return "dhshin";
    }

    public int getNumber() {
        return 100;
    }
}
