package com.example.demo.service;

import java.util.Optional;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dto.ProductStockDto;
import com.example.demo.model.ProductStock;
import com.example.demo.repository.ProductStockRepository;


@Service
public class ProductStockServiceImpl implements ProductStockService{

	Logger logger = LogManager.getLogger(ProductStockServiceImpl.class);
	
	@Autowired
	ProductStockRepository productStockRepository;
	
	@Autowired
	Environment env;
	@Override
	public ProductStockDto getProductStock(String productName, String productAvailability) {
		try {
			Optional<ProductStock>productStock=productStockRepository.findByProductNameAndProductAvailability(productName, productAvailability);
			if(!productStock.isPresent())
				return new ProductStockDto();
			
			ProductStockDto productStockDto=new ProductStockDto();
			
			BeanUtils.copyProperties(productStock.get(), productStockDto);
			productStockDto.setPort(Integer.parseInt(env.getProperty("local.server.port")));
			return productStockDto;
		}catch(Exception e)
		{
			logger.error(e.getMessage(), e);
			return new ProductStockDto();
		}
	}

}
