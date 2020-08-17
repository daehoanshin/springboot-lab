package me.xbb123;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.boot.test.json.JsonContent;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.json.JacksonTester.initFields;


/**
 * @author xbb123
 */
@RunWith(SpringRunner.class)
@JsonTest
public class SampleJsonTest {

    JacksonTester<Sample> sampleJacksonTester;

    JacksonTester<Person> personJacksonTester;

    @Before
    public void setup() {
        ObjectMapper objectMapper = new ObjectMapper();
        initFields(this, objectMapper);
    }


    @Test
    public void testJson() throws IOException {
        assertThat(personJacksonTester).isNotNull();

        Sample sample = new Sample();
        sample.setName("dhshin");
        sample.setNumber(100);
        JsonContent<Sample> sampleJson = this.sampleJacksonTester.write(sample);
        assertThat(sampleJson)
                .hasJsonPathStringValue("@.name")
                .extractingJsonPathStringValue("@.name").isEqualTo("dhshin");

        assertThat(sampleJson)
                .hasJsonPathNumberValue("@.number")
                .extractingJsonPathNumberValue("@.number").isEqualTo(100);
    }
}
