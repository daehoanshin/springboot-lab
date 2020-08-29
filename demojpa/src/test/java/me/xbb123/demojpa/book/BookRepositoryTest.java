package me.xbb123.demojpa.book;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest
//@DataJpaTest
public class BookRepositoryTest {

    @Autowired
    BookRepository bookRepository;

    @Test
    public void testFindByIsbn() {
        Book book = new Book();
//        book.setIsbn(String.valueOf(new Random().nextGaussian()));
        book.setIsbn("123");
        Book saveBook = bookRepository.save(book);
//        Optional<Book> book123 = bookRepository.findByIsbn("123");
//        assertThat(book123).isEmpty();

//        Book saveBook = bookRepository.save(book);

//        assertThat(saveBook.getId()).isNotNull();

//        assertThat(bookRepository.findByIsbn("123")).isEqualTo("123");
//        assertThat(bookRepository.findByIsbn("123")).isNotEmpty();
    }

    @Test
    public void testFindByTitle() {
        List<Book> books = bookRepository.findByTitleIsLike("spring");
        assertThat(books).isEmpty();
    }
}