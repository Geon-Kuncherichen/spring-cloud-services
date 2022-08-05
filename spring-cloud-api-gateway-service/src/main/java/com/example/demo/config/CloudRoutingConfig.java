package com.example.demo.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CloudRoutingConfig {
	
	@Bean
	public RouteLocator gatewayRoute(RouteLocatorBuilder builder)
	{
		return builder.routes().route( r ->r.path("/product/**").uri("lb://product-enquiry-service").id("stock-enquiry")).build();
	}

}
