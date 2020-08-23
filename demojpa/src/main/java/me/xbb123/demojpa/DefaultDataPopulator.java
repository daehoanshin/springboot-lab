package me.xbb123.demojpa;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author xbb123
 */
@Component
public class DefaultDataPopulator implements ApplicationRunner {
    @Autowired
    MeetingRepository meetingRepository;

    @Autowired
    PersonRepository personRepository;

    @Autowired
    DSLContext dsl;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Person person = new Person();
        person.setEmail("dhshin@email.com");
        person.setName("dhshin");
        person.setJoined(new Date());
        personRepository.save(person);
        personRepository.findByEmail("dhshin@email");

        Meeting meeting = new Meeting();
        meeting.setTitle("new meeting");
        meeting.setLocation("seoul");
        meetingRepository.save(meeting);
        
    }
}
