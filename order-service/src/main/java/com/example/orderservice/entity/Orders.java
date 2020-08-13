package com.example.orderservice.entity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Orders {
	//Validation of I/P params
	@NotNull
	@Size(min=2, message = "Customer name is mandatory")
	private String customerName;
	@NotNull
	@Size(min=2, message = "Order Date is mandatory")
	private String orderDate;
	@NotNull
	@Size(min=2, message = "Shipping Address is mandatory")
	private String shippingAddress;
	private String orderItems;
	private Integer total;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public String getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(String orderItems) {
		this.orderItems = orderItems;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Orders [customerName=" + customerName + ", orderDate=" + orderDate + ", shippingAddress="
				+ shippingAddress + ", orderItems=" + orderItems + ", total=" + total + "]";
	}
	
	
	
	
}
