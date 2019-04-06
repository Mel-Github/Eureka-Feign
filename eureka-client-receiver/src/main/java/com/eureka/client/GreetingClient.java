package com.eureka.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;


@FeignClient("EUREKA-CLIENT")
public interface GreetingClient {
    @RequestMapping("/greeting")
    String greeting();
}
