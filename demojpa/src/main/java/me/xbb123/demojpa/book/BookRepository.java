package me.xbb123.demojpa.book;

import me.xbb123.demojpa.book.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.lang.NonNull;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Integer> {
    Optional<Book> findByIsbn(String isbn);
    List<Book> findByTitleIsLike(@NonNull String title);
}

/*
@RepositoryDefinition(domainClass = Book.class, idClass = Integer.class)
public interface BookRepository {
    Optional<Book> findByIsbn(String isbn);

    Book save(Book entity);

    List<Book> findByTitleIsLike(@NonNull String title);
}*/
