package com.eureka;


import com.eureka.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class EurekaClientApplication implements CommandLineRunner {

	@Autowired
	private EventService eventService;

	private UUID corrId = UUID.randomUUID();

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApplication.class, args);
	}

	@Override
	public void run(String... args) {
/*		Event event = new Event("This is an Event -" + corrId );
		eventService.save(event);*/
	}
}