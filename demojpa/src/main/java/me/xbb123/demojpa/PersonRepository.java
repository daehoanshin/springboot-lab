package me.xbb123.demojpa;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author xbb123
 */
public interface PersonRepository extends JpaRepository<Person, Long> {
    Optional<Person> findByEmail(String email);
}
