/**
 * @author xbb123
 */

package me.xbb123;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/*@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc*/
public class SampleControllerTest {

   /* @Configuration
    @ComponentScan(basePackageClasses = Application.class)
    static class TestConfig {
        @Bean
        public String myBean() {
            return "myBean";
        }
    }
    @Autowired
    String myBean;*/

    @LocalServerPort
    int port;

//    @Autowired
    WebTestClient webTestClient;


/*    @Autowired
    MockMvc mockMvc;

    @Autowired
    WebApplicationContext wac;

    @Autowired
    TestRestTemplate testRestTemplate;*/

//    @MockBean
    SampleService sampleService;

    /*@Test
    public void testFoo() throws Exception {
        System.out.println("================= PORT =================");
        System.out.println(port);


        assertThat(mockMvc).isNotNull();
        mockMvc.perform(get("/foo"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello"))
                .andDo(print());
    }*/

//    @Test
    public void testFooWithWebTestClient() {
        System.out.println(sampleService.getNumber());
        given(sampleService.getName()).willReturn("Spy");

        webTestClient.get().uri("/foo").exchange()
                .expectStatus().isOk()
                .expectBody(String.class).isEqualTo("Spy");
    }

   /* @Test
    public void testFooWithRestTemplate() {
        String body = testRestTemplate.getForObject("/foo", String.class);
        assertThat(body).isEqualTo("Hello");
    }*/

    /*@Test
    public void testBoo() {
        assertThat(myBean).isNotNull();
        assertThat("hello").isEqualTo("hello");
    }*/
}



