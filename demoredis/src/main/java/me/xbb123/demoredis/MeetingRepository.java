package me.xbb123.demoredis;

import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.repository.CrudRepository;

/**
 * @author xbb123
 */

public interface MeetingRepository extends CrudRepository<Meeting, String> {
}
