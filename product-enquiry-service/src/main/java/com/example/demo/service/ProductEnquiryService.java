package com.example.demo.service;

import com.example.demo.dto.ProductEnquiryDto;

public interface ProductEnquiryService {

	ProductEnquiryDto getEnquiryOfProduct(String productName, String productAvailability, Integer unit);

}
