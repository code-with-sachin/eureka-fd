package com.sachinsk.eureka_fd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaFdApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaFdApplication.class, args);
	}

}
