package me.xbb123.demoneo4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Demoneo4jApplication {

    @Autowired
    MeetingRepository meetingRepository;

    public static void main(String[] args) {
        SpringApplication.run(Demoneo4jApplication.class, args);
    }

    @Bean
    public ApplicationRunner applicationRunner() {
        return args -> {
            Meeting meeting = new Meeting();
            meeting.setName("New Meeting");
            meeting.setTitle("Neo4J Study");
            meetingRepository.save(meeting);
        };
    }
}
