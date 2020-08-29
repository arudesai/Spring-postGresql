package com.arudesai.service;

import com.arudesai.model.Speaker;
import com.arudesai.repository.HibernateSpeakerRepositoryImpl;
import com.arudesai.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //("speakerService")
public class SpeakerServiceImpl implements SpeakerService {

    SpeakerRepository repository;
    @Autowired
    public SpeakerServiceImpl(SpeakerRepository repository){
        this.repository=repository;
    }

//    public void setRepository(SpeakerRepository repository) {
//        this.repository = repository;
//    }

    @Override
    public List<Speaker> findAll(){
    return repository.findAll();
    }
}
