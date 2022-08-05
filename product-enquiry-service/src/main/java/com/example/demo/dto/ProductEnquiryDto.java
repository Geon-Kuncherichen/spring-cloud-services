package com.example.demo.dto;

import java.math.BigDecimal;

public class ProductEnquiryDto {

    private Long id;
    private String productName;
    private BigDecimal productPrice;
    private String productAvailability;
    private double discountOffer;

    private int unit;
    private BigDecimal totalPrice;

    private int port;
    private BigDecimal discountPrice;
    
  

 

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductAvailability() {
        return productAvailability;
    }

    public void setProductAvailability(String productAvailability) {
        this.productAvailability = productAvailability;
    }

    public double getDiscountOffer() {
        return discountOffer;
    }

    public void setDiscountOffer(double discountOffer) {
        this.discountOffer = discountOffer;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

	public BigDecimal getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(BigDecimal discountPrice) {
		this.discountPrice = discountPrice;
	}

	@Override
	public String toString() {
		return "ProductEnquiryDto [id=" + id + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productAvailability=" + productAvailability + ", discountOffer=" + discountOffer + ", unit=" + unit
				+ ", totalPrice=" + totalPrice + ", port=" + port + ", discountPrice=" + discountPrice + "]";
	}

   
}