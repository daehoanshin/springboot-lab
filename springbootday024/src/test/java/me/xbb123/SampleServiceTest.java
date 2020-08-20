package me.xbb123;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.client.MockRestServiceServer;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

/**
 * @author xbb123
 */
/*@RunWith(SpringRunner.class)
@RestClientTest(SampleServiceImpl.class)*/
public class SampleServiceTest {
    @Autowired
    SampleService sampleService;

    @Autowired
    MockRestServiceServer server;

    @Test
    public void fooTest() {
        this.server.expect(requestTo("/foo"))
                .andRespond(withSuccess("dhshin", MediaType.TEXT_PLAIN));

        String name = sampleService.getName();
        Assertions.assertThat(name).isEqualTo("dhshin");
    }
}


