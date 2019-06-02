package com.example.sirdm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SirdmApplication {

	public static void main(String[] args) {
		SpringApplication.run(SirdmApplication.class, args);
	}

}
