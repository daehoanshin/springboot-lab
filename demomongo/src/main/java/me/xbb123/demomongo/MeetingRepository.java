package me.xbb123.demomongo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import reactor.core.publisher.Flux;

import java.util.List;

/**
 * @author xbb123
 */
//public interface MeetingRepository extends PagingAndSortingRepository<Meeting, String> {
public interface MeetingRepository extends ReactiveMongoRepository<Meeting, String> {
    //    List<Meeting> findByAddress(String address);
    Flux<Meeting> findByAddress(String address);
}
