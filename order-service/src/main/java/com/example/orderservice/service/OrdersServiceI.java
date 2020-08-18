package com.example.orderservice.service;

import java.util.List;

import com.example.orderservice.dto.Orders;

public interface OrdersServiceI {

	public List<Orders> retrieveOrders();

	public Orders createOrder(Orders order);

	public Orders retrieveOrderInfo(String customerName);
	
	public Orders retrieveOrder(Integer id);
}
