package com.example.demo.service;

import com.example.demo.dto.ProductStockDto;

public interface ProductStockService {

	ProductStockDto getProductStock(String productName, String productAvailability);

}
