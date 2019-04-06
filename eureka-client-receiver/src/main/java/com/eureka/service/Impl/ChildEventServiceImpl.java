package com.eureka.service.Impl;

import com.eureka.domain.ChildEvent;
import com.eureka.repository.ChildEventRepository;
import com.eureka.service.ChildEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChildEventServiceImpl implements ChildEventService {

    @Autowired
    ChildEventRepository childEventRepository;

    public void save(ChildEvent event){
        childEventRepository.save(event);
    }
}
