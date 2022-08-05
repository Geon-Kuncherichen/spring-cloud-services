package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ProductStockDto;
import com.example.demo.service.ProductStockService;

@RestController
@RequestMapping("/product")
public class ProductStockController {
	
	@Autowired
	ProductStockService productStockService;
	
	
	
	@GetMapping("/checkProductStock")
	public ResponseEntity<ProductStockDto> checkProductStock(@RequestParam("productName")String productName,
			@RequestParam("productAvailability")String productAvailability)
	{
		return new ResponseEntity<ProductStockDto>(productStockService.getProductStock(productName,productAvailability),HttpStatus.OK);
	}

}
