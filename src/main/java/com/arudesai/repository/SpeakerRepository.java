package com.arudesai.repository;

import com.arudesai.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
