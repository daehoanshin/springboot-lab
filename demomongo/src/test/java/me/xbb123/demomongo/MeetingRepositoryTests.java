package me.xbb123.demomongo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author xbb123
 */
@RunWith(SpringRunner.class)
@DataMongoTest
public class MeetingRepositoryTests {
    @Autowired
    MeetingRepository meetingRepository;

    @Test
    public void findByAddress() {
        // Given
        Meeting meeting = new Meeting();
        meeting.setTitle("new meeting");
        meeting.setAddress("redmond");
        meetingRepository.save(meeting).block();
        Meeting mongoMeeting = new Meeting();
        mongoMeeting.setTitle("mongo study");
        mongoMeeting.setAddress("seattle");
        meetingRepository.save(mongoMeeting).block();

        // When
//        List<Meeting> result = meetingRepository.findByAddress("seattle");
        List<Meeting> result = meetingRepository.findByAddress("seattle").collectList().block();

        // Then
        assertThat(result.size()).isEqualTo(1);
        assertThat(result).contains(mongoMeeting);
    }
}
