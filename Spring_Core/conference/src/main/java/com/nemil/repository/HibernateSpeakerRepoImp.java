package com.nemil.repository;

import com.nemil.model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Repository("speakerRepo")
public class HibernateSpeakerRepoImp implements SpeakerRepo {

    @Autowired
    private Calendar cal;

    @Value("#{ T (java.lang.Math).random()*100}")
    private double seedNum;

    public List<Speaker> findAll(){

        System.out.println("cal: " + cal.getTime());

        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker1 = new Speaker();
        Speaker speaker2 = new Speaker();

        speaker1.setFirstName("Himanshu");
        speaker1.setLastName("Modi");
        speaker1.setSeedNum(seedNum);

        speaker2.setFirstName("Nemil");
        speaker2.setLastName("Shah");
        speaker2.setSeedNum(seedNum);

        speakers.add(speaker1);
        speakers.add(speaker2);

        return speakers;
    }
}
