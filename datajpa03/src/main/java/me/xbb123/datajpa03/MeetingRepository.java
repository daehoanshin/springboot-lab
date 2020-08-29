package me.xbb123.datajpa03;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MeetingRepository extends JpaRepository<Meeting, Long> {
    List<Meeting> findByTitleIsLikeIgnoreCase(String title);
}

