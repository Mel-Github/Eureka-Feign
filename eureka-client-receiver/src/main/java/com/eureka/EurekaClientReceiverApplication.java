package com.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

//		(scanBasePackages="com.client")

public class EurekaClientReceiverApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(EurekaClientReceiverApplication.class, args);

//		for (String name : applicationContext.getBeanDefinitionNames()) {
//			System.out.println("The name is " + name);
//		}
	}
}
