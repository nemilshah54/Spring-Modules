package com.pluralsight.conferencedemo.repositories;

import com.pluralsight.conferencedemo.models.Session;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SessionJpaRepo extends JpaRepository<Session,Long> {
    public List<Session> findBySessionNameContains(String name);
    public List<Session> findBySessionLengthEquals(Integer length);
    public List<Session> findBySessionLengthNot(Integer length);
    public List<Session> findBySessionNameIgnoreCaseLike(String name);

    public List<Session> findBySessionNameIgnoreCaseStartingWith(String character);
    public List<Session> findBySessionNameEndingWith(String character);
    public List<Session> findBySessionNameIgnoreCaseContaining(String character);

    @Query("select s from Session s where s.sessionName like %:name")
    Page<Session> getSessionsWithName(@Param("name") String name, Pageable pageable);
}
