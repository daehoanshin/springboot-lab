package me.xbb123;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * @author xbb123
 */
@RunWith(SpringRunner.class)
@WebFluxTest
public class SpringWebFluxTest {

    @Autowired
    WebTestClient webTestClient;

    @MockBean
    SampleService sampleService;

    @Test
    public void testFoo() throws Exception {
        given(sampleService.getName()).willReturn("dhshin");

        webTestClient.get().uri("/foo").exchange()
                .expectStatus().isOk()
                .expectBody(String.class).isEqualTo("dhshin");
    }
}
