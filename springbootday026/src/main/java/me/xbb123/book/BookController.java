package me.xbb123.book;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author xbb123
 */
@RestController
public class BookController {
    @GetMapping("/foo")
    public String getFoo() {
        return "whiteship";
    }

    @GetMapping("/flux")
    public Flux<String> flux() {
        return Flux.just("a", "b", "c");
    }

    @GetMapping("/mono")
    public Mono<String> mono() {
        return Mono.just("mono");
    }
}
