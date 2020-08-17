package me.xbb123;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.rule.OutputCapture;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * @author xbb123
 */
//@RunWith(SpringRunner.class)
//@WebMvcTest
//@AutoConfigureRestDocs
public class SpringWebMvcTest {

    /*@Autowired
    TestRestTemplate testRestTemplate;

    @Autowired
    MockMvc mockMvc;

    @MockBean
    SampleService sampleService;

    @Rule
    public OutputCapture capture = new OutputCapture();


    @Test
    public void testFoo() throws Exception {
        given(sampleService.getName()).willReturn("dhshin");

        mockMvc.perform(get("/foo"))
                .andExpect(handler().handlerType(SampleController.class))
                .andExpect(handler().methodName("foo"))
                .andExpect(status().isOk())
                .andExpect(content().string("dhshin"));
        assertThat(capture.toString()).contains("World");
    }*/

    /*@TestConfiguration
    static class ResultHandlerConfiguration {

        @Bean
        public RestDocumentationResultHandler restDocumentation() {
            return MockMvcRestDocumentation.document("{method-name}");
        }
    }*/
}
