package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class PropertyAccessServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PropertyAccessServiceApplication.class, args);
	}
	
	@Bean
	public RestTemplate getRestTemp()
	{
		return new RestTemplate();
	}

}
