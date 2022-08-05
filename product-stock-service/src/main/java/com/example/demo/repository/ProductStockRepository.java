package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.ProductStock;

public interface ProductStockRepository extends JpaRepository<ProductStock, Long>{
	
	Optional<ProductStock> findByProductNameAndProductAvailability(String name,String availability);

}
