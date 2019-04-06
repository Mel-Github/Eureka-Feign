package com.eureka.controller;

import com.eureka.client.GreetingClient;
import com.eureka.domain.ChildEvent;
import com.eureka.service.ChildEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;
import java.util.logging.Logger;

@EnableFeignClients (basePackages = {"com.eureka.client"})
@Controller
public class HomeController {

    private static final Logger LOGGER = Logger.getLogger(HomeController.class.getName());

    private UUID corrId = UUID.randomUUID();

    @Autowired
    private GreetingClient greetingClient;

    @Autowired
    ChildEventService childEventService;

    @RequestMapping("/get-greeting")
    public String greeting(Model model) {

        // This event record will be created inside our Event microservice.

        LOGGER.info("getting from greetingClient " + greetingClient.greeting());
        model.addAttribute("greeting", greetingClient.greeting());
        ChildEvent event = new ChildEvent("This is an Source Event -" + corrId );
        childEventService.save(event);
        return "greetingview";
    }

    @RequestMapping("/testing")
    public String testing(Model model){
        model.addAttribute("greeting", "testing");
        LOGGER.info("getting from testing ");
        return "greetingview";
    }

}
