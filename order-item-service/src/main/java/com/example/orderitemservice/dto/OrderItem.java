package com.example.orderitemservice.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class OrderItem {

	@NotNull
	@Size(min = 2, message = "Product Code is mandatory")
	private String productCode;
	@NotNull
	@Size(min = 2, message = "Product Name is mandatory")
	private String productName;
	private Integer quantity;
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
}
