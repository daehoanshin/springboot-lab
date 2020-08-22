package me.xbb123;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author xbb123
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public ApplicationRunner runner(final JdbcTemplate jdbcTemplate) {
        return new ApplicationRunner() {
            public void run(ApplicationArguments args) throws Exception {
                Integer count = jdbcTemplate.queryForObject("select count(*) from users", Integer.class);
                System.out.println("count: " + count);
            }
        };
    }
}
