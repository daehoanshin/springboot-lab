package me.xbb123.demoneo4j;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.neo4j.DataNeo4jTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author xbb123
 */
@RunWith(SpringRunner.class)
@DataNeo4jTest
public class MeetingRepositoryTest {
    @Autowired
    MeetingRepository meetingRepository;

    @Test
    public void findByAddress() {
        Meeting meeting = new Meeting();
        meeting.setTitle("neo4j study");
        meeting.setName("seattle");
        meetingRepository.save(meeting);

        meetingRepository.findByTitleContains("neo4j");
        List<Meeting> result = meetingRepository.findByTitleContains("neo4j");

        assertThat(result.size()).isEqualTo(1);
        assertThat(result).contains(meeting);

    }
}
