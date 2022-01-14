package com.pluralsight.conferencedemo.repositories;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.pluralsight.conferencedemo.models.Session;
import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class SessionRepository {

    @Autowired
    private SessionJpaRepo jpaRepository;

    @PersistenceContext
    private EntityManager entityManager;

    public Session create(Session session) {
        return  jpaRepository.saveAndFlush(session);
    }

    public Session update(Session session) {
        return (Session) jpaRepository.saveAndFlush(session);
    }

    public void delete(Long id) {
        jpaRepository.deleteById(id);
    }

    public Session find(Long id) {
        return (Session) jpaRepository.getOne(id);
    }

    public List<Session> list() {
        return jpaRepository.findAll();
    }

    public List<Session> getSessionsThatHaveName(String name) {
        return jpaRepository.findBySessionNameContains(name);
    }
}