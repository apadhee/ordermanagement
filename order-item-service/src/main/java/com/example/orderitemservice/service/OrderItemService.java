package com.example.orderitemservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.orderitemservice.entity.OrderItem;
import com.example.orderitemservice.repository.OrderItemRepository;

@Service
public class OrderItemService {

	@Autowired
	private OrderItemRepository orderItemRepository;
	
	public List<OrderItem> retrieveOrderItems() {
		return orderItemRepository.findAll();
		
	};
	
	public OrderItem createOrder(OrderItem order) {
		 if(orderItemRepository.createOrderItem(order) == 1) {
			 return order;
		 }
		 else {
			 throw new RuntimeException();
		 }
	}
}
