package com.pluralsight.conferencedemo.repositories;

import com.pluralsight.conferencedemo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SpeakerJpaRepo extends JpaRepository<Speaker, Long> {

    public Speaker findByFirstNameAndLastName(String firstName, String lastName);
    public List<Speaker> findByCompanyOrderByLastName(String lastName);
    public List<Speaker> findByCompanyIn(List<String> companies);
}
