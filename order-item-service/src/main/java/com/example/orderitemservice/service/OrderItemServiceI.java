package com.example.orderitemservice.service;

import java.util.List;

import com.example.orderitemservice.dto.OrderItem;

public interface OrderItemServiceI {

	public List<OrderItem> retrieveOrderItems();

	public OrderItem createOrder(OrderItem order);
}
