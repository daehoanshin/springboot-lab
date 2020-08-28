package me.xbb123.demojpa.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Date;
@Component
public class BookRunner implements ApplicationRunner {

    @Autowired
    BookRepository bookRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Book book = new Book();
        book.setName("dhshin JPA");
        book.setCreated(new Date());
        bookRepository.save(book);
    }
}
