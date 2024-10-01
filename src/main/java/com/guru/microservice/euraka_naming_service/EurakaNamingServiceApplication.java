package com.guru.microservice.euraka_naming_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurakaNamingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurakaNamingServiceApplication.class, args);
	}

}
