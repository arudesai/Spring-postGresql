package com.arudesai.repository;

import com.arudesai.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
    @Override
    public List<Speaker> findAll(){
        List<Speaker> speakers = new ArrayList<>();
        Speaker speaker=new Speaker();
        speaker.setFirstName("Bryan");
        speaker.setListName("Hanser");

        speakers.add(speaker);
        return speakers;
    }
}
