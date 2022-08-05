package com.example.demo.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ProductEnquiryDto;
import com.example.demo.proxyclient.ProductStockClient;


@Service
public class ProductEnquiryServiceImpl implements ProductEnquiryService{
	
	Logger logger = LogManager.getLogger(ProductEnquiryServiceImpl.class);
	
	
	@Autowired
	ProductStockClient productStockClient;

	@Override
	public ProductEnquiryDto getEnquiryOfProduct(String productName, String productAvailability, Integer unit) {
		try {
			
			Optional<ProductEnquiryDto>productEnquiryDto=Optional.of(productStockClient.checkProductStock(productName, productAvailability));
			if(!productEnquiryDto.isPresent())
				return new ProductEnquiryDto();
			
			productEnquiryDto.get().setTotalPrice(productEnquiryDto.get().getProductPrice().multiply(BigDecimal.valueOf(unit)));
			productEnquiryDto.get().setDiscountPrice((productEnquiryDto.get().getTotalPrice().subtract((productEnquiryDto.get().getTotalPrice().multiply(new BigDecimal(productEnquiryDto.get().getDiscountOffer()/100))))).setScale(2,BigDecimal.ROUND_HALF_EVEN));
			return productEnquiryDto.get();
		}catch(Exception e)
		{
			logger.error(e.getMessage(),e);
			return new ProductEnquiryDto();
		}
	}

}
