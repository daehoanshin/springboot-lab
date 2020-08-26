package me.xbb123.demorestclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.util.StopWatch;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;

@SpringBootApplication
public class DemoRestclientApplication {
    /*@Autowired
    RestTemplateBuilder restTemplateBuilder;*/
    @Autowired
    WebClient.Builder webClientBuilder;

    public static void main(String[] args) {
        SpringApplication.run(DemoRestclientApplication.class, args);
    }

    @Bean
    public ApplicationRunner applicationRunner() {
        return args -> {
            StopWatch stopWatch = new StopWatch();
            stopWatch.start();

            WebClient webClient = webClientBuilder.baseUrl("https://api.github.com").build();
            /*Mono<GithubRepository[]> reposMono = webClient.get().uri("/users/daehoanshin/repos")
                    .retrieve()
                    .bodyToMono(GithubRepository[].class);
            Mono<GithubCommit[]> commitMono = webClient.get().uri("/repos/daehoanshin/springboot-lab/commits")
                    .retrieve()
                    .bodyToMono(GithubCommit[].class);

            reposMono.doOnSuccess(ra -> {
                Arrays.stream(ra).forEach(r -> {
                    System.out.println("repo:" + r.getUrl());
                });
            }).subscribe();

            commitMono.doOnSuccess(ca -> {
                Arrays.stream(ca).forEach(c -> {
                    System.out.println("commit:" + c.getSha());
                });
            }).subscribe();
                    */

            Flux<GithubRepository> reposMono = webClient.get().uri("/users/daehoanshin/repos")
                    .retrieve()
                    .bodyToFlux(GithubRepository.class);

            Flux<GithubCommit> commitMono = webClient.get().uri("/repos/daehoanshin/springboot-lab/commits")
                    .retrieve()
                    .bodyToFlux(GithubCommit.class);


            reposMono.doOnNext(r -> {
                System.out.println("repo:" + r.getUrl());
            }).subscribe();

            commitMono.doOnNext(c -> {
                System.out.println("commit:" + c.getSha());
            }).subscribe();

            /*RestTemplate restTemplate = restTemplateBuilder.build();
            GithubRepository[] result = restTemplate.getForObject("https://api.github.com/users/daehoanshin/repos", GithubRepository[].class);
            Arrays.stream(result).forEach(r -> {
                System.out.println("repo: " + r.getUrl());
            });

            GithubCommit[] commits = restTemplate.getForObject("https://api.github.com/repos/daehoanshin/springboot-lab/commits", GithubCommit[].class);
            Arrays.stream(commits).forEach(c -> {
                System.out.println("commit:" + c.getSha());
            });*/

            stopWatch.stop();
            System.out.println(stopWatch.prettyPrint());
        };
    }
}
