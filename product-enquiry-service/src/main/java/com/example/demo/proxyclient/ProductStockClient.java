package com.example.demo.proxyclient;

import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dto.ProductEnquiryDto;

//@FeignClient(name="product-stock-service",url="http://localhost:8800//product")
@FeignClient(name="product-stock-service")
public interface ProductStockClient {
	
	
	@GetMapping("product/checkProductStock")
	public ProductEnquiryDto checkProductStock(@RequestParam("productName")String productName,
			@RequestParam("productAvailability")String productAvailability);

}
