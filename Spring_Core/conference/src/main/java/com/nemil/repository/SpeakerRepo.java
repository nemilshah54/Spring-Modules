package com.nemil.repository;

import com.nemil.model.Speaker;

import java.util.List;

public interface SpeakerRepo {
    List<Speaker> findAll();
}
