package com.arudesai.repository;

import com.arudesai.model.Speaker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
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
