package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ProductEnquiryDto;
import com.example.demo.service.ProductEnquiryService;

@RestController
@RequestMapping("product")
public class ProductEnquiryController {
	
	@Autowired
	ProductEnquiryService productEnquiryService;
	
	
	@GetMapping("/getEnquiryOfProduct")
	public ResponseEntity<ProductEnquiryDto> getEnquiryOfProduct(@RequestParam("productName")String productName,
			@RequestParam("productAvailability")String productAvailability,
			@RequestParam("unit")Integer unit)
	{
		return new ResponseEntity<ProductEnquiryDto>(productEnquiryService.getEnquiryOfProduct(productName,productAvailability,unit),HttpStatus.OK);
	}

}
