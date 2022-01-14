package com.pluralsight.conferencedemo.models;

import com.pluralsight.conferencedemo.repositories.SessionJpaRepo;
import com.pluralsight.conferencedemo.repositories.SessionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class SessionTest {

    @Autowired
    private SessionRepository repository;

    @Autowired
    private SessionJpaRepo sessionJpaRepo;

    @Test
    public void test() throws Exception {
        List<Session> sessions = repository.getSessionsThatHaveName("Java");
        for(Session session : sessions){
            System.out.println("Session Name: "  + session.getSessionName());
        }
       // assertTrue(sessions.size() > 0);
    }

    @Test
    public void startEnding() throws Exception {
        List<Session> sessions = sessionJpaRepo.findBySessionNameIgnoreCaseContaining("j");
        for( Session s : sessions){
            System.out.println("Session Name: " + s.getSessionName());
        }
       // assertTrue(sessions.size() > 0);
    }

    @Test
    public void Equals() throws Exception {
        List<Session> sessions = sessionJpaRepo.findBySessionLengthEquals(30);
        for( Session s : sessions){
            System.out.println("Session Length: " + s.getSessionLength());
        }

        List<Session> sessions2 = sessionJpaRepo.findBySessionLengthNot(30);
        for( Session s : sessions2){
            System.out.println("Session Length: " + s.getSessionLength());
        }

        // assertTrue(sessions.size() > 0);
    }

    @Test
    public void Like() throws Exception {

        List<Session> sessions3 = sessionJpaRepo.findBySessionNameIgnoreCaseLike("%Java%");
        for( Session s : sessions3){
            System.out.println("Session Length: " + s.getSessionName());
        }
    }

    @Test
    public void testPagingSorting() throws Exception {
        Page<Session> page = sessionJpaRepo.getSessionsWithName("Java", PageRequest.of(1, 5, Sort.by(Sort.Direction.DESC, "sessionLength")));

        for ( Session session : page){
            System.out.println("Session name: " + session.getSessionName() );
            System.out.println("Session length: " + session.getSessionLength());
        }

    }


}
