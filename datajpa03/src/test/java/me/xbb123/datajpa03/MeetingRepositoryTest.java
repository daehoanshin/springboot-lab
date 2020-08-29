package me.xbb123.datajpa03;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class MeetingRepositoryTest {
    @Autowired MeetingRepository repository;

    @Test
    public void di() {
        assertThat(repository).isNotNull();
    }

    @Test
    public void findByTitle() {
        Meeting meeting = new Meeting();
        meeting.setTitle("dhshin");
        repository.save(meeting);

        List<Meeting> result = repository.findByTitleIsLikeIgnoreCase("%dh%");
        assertThat(result).hasSize(1);
    }
}