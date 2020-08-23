package me.xbb123.demomongo;

import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.MongoDbFactory;

import java.security.PublicKey;

@SpringBootApplication
public class DemomongoApplication {
    @Autowired
    MongoDbFactory mongoDbFactory;

    public static void main(String[] args) {
        SpringApplication.run(DemomongoApplication.class, args);
    }

    @Bean
    public ApplicationRunner applicationRunner() {
        return args -> {
            MongoDatabase db = mongoDbFactory.getDb();
            db.createCollection("meetings");

            db.getCollection("meetings").insertOne(
                    new Document()
                            .append("title", "new meeting")
                            .append("location", "seattle"));

        };
    }
}
