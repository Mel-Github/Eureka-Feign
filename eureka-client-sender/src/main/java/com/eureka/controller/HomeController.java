package com.eureka.controller;


import com.eureka.client.GreetingController;
import com.eureka.domain.Event;
import com.eureka.service.EventService;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
import java.util.logging.Logger;

@RestController
public class HomeController implements GreetingController {

    private static final Logger LOGGER = Logger.getLogger(HomeController.class.getName());

    private UUID corrId= UUID.randomUUID();

    @Autowired
    private EurekaClient eurekaClient;

    @Autowired
    private EventService eventService;


    @Value("${spring.application.name}")
    private String appName;

    @Override
    public String greeting() {
        //corrId = UUID.randomUUID();
        // This event record will be created inside our User microservice.

        Event event = new Event("This is an Duplicated Event -" + corrId );
        LOGGER.info("Into Sender greeting method for " + corrId);
        try{
            eventService.save(event);
        }catch (DataIntegrityViolationException e) {
            LOGGER.severe("history already exist");
        }
        return String.format("Hello from '%s'!", eurekaClient.getApplication(appName).getName());
    }
}
