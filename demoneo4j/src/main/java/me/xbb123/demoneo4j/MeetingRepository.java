package me.xbb123.demoneo4j;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.GraphRepositoryQuery;

import java.util.List;

/**
 * @author xbb123
 */
public interface MeetingRepository extends Neo4jRepository<Meeting, Long> {
    List<Meeting> findByTitleContains(String title);
}
