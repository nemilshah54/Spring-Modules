package com.pluralsight.conferencedemo.models;

import com.pluralsight.conferencedemo.repositories.SpeakerJpaRepo;
import com.pluralsight.conferencedemo.repositories.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class SpeakerTest {
    @Autowired
    private SpeakerJpaRepo repository;

    @PersistenceContext
    private EntityManager entityManager;

    @Test
    public void testFind() throws Exception {
        Speaker speaker = repository.getOne(1L);
        assertNotNull(speaker);
    }

    @Test
    @Transactional
    public void testSaveAndGetAndDelete() throws Exception {
        Speaker s = new Speaker();
        s.setCompany("Pluralsight");
        s.setFirstName("Dan");
        s.setLastName("Bunker");
        s.setTitle("Author");
        s.setSpeakerBio("Consulting and mentoring");
        s = repository.saveAndFlush(s);

        // clear the persistence context so we don't return the previously cached location object
        // this is a test only thing and normally doesn't need to be done in prod code
        entityManager.clear();

        Speaker otherSpeaker = repository.getOne(s.getSpeakerId());
        assertEquals("Dan", otherSpeaker.getFirstName());

        repository.deleteById(otherSpeaker.getSpeakerId());
    }

    @Test
    public void firstNameAndLastName() throws Exception {
       Speaker speaker = repository.findByFirstNameAndLastName("Justin", "Clark");
       System.out.println("Speaker Name: " + speaker.getFirstName() + " " + speaker.getLastName());
      //  assertNotNull(speaker);
    }

    @Test
    public void In() throws Exception {
        List<String> companies = new ArrayList<>();
        companies.add("National Bank");
        companies.add("Contoso");

        List<Speaker> speakers = repository.findByCompanyIn(companies);

        for(Speaker speaker: speakers){
            System.out.println("Speaker company: " + speaker.getCompany());
        }
        //  assertNotNull(speaker);
    }

    @Test
    public void OrderBy() throws Exception {

        List<Speaker> speakers = repository.findByCompanyOrderByLastName("National Bank");

        for(Speaker speaker: speakers){
            System.out.println("Speaker Name: " + speaker.getLastName());
        }
        //  assertNotNull(speaker);
    }

}
