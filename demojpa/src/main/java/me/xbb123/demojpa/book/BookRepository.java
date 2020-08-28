package me.xbb123.demojpa.book;

import me.xbb123.demojpa.book.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
