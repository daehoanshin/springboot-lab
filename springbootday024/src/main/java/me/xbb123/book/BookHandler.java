package me.xbb123.book;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author xbb123
 */
@Controller
public class BookHandler {
    public Mono<ServerResponse> allBooks(ServerRequest request) {
        Book book1 = new Book();
        book1.setIsbn("1123");
        book1.setTitle("Boot Spring Boot");
        Book book2 = new Book();
        book2.setIsbn("2222");
        book2.setTitle("Boot Spring Framework 5");
        Flux<Book> books = Flux.just(book1, book2);
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(books, Book.class);
    }
}
