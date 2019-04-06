package com.eureka.service.Impl;

import com.eureka.domain.Event;
import com.eureka.repository.EventRepository;
import com.eureka.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    EventRepository eventRepository;

    public void save(Event event){
        eventRepository.save(event);
    }
}
