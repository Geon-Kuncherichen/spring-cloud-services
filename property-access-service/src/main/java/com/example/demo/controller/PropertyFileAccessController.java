package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.models.PropertyAccessBean;
import com.example.demo.models.PropertyAccessvalue;

@RestController
@RequestMapping("/access")
public class PropertyFileAccessController {
	
	@Autowired
	PropertyAccessBean propertyAccessBean;
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/getProperty")
	public PropertyAccessvalue getProperty()
	{
		refershActuator();
		return new PropertyAccessvalue(propertyAccessBean.getName(),propertyAccessBean.getDescription());
	}
	
	public void refershActuator()
	{
		String baseUrl="http://localhost:8100/actuator/refresh";
		HttpHeaders header=new HttpHeaders();
		header.set("Content-Type","application/json");
		HttpEntity entity=new HttpEntity(header);
		ResponseEntity<String>response=restTemplate.postForEntity(baseUrl, entity, String.class);
		
		
		
		
	}

}
