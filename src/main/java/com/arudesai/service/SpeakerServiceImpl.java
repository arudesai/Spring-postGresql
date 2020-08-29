package com.arudesai.service;

import com.arudesai.model.Speaker;
import com.arudesai.repository.HibernateSpeakerRepositoryImpl;
import com.arudesai.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    SpeakerRepository repository;

    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Speaker> findAll(){
    return repository.findAll();
    }
}
