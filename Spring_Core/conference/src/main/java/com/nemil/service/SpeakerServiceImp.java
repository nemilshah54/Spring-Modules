package com.nemil.service;

import com.nemil.model.Speaker;
import com.nemil.repository.HibernateSpeakerRepoImp;
import com.nemil.repository.SpeakerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service("speakerService")
public class SpeakerServiceImp implements SpeakerService {

   //  private SpeakerRepo repo = new HibernateSpeakerRepoImp();
    private SpeakerRepo repo;

    // Default constructor.
    public SpeakerServiceImp(){
        System.out.println("Defalut cons.");
    }
    // Constructor Injection.
    @Autowired
    public SpeakerServiceImp(SpeakerRepo speakerRepo){
        this.repo = speakerRepo;
    }

    @PostConstruct
    private void initialize(){
        System.out.println("Post constructor");
    }

     // Setter Injection
   // @Autowired
    public void setRepo(SpeakerRepo repo) {
        System.out.println("Setter..");
        this.repo = repo;
    }

    public List<Speaker> findAll(){
        return repo.findAll();
    }
}
