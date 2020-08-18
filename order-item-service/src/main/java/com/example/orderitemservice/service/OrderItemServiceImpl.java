package com.example.orderitemservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.orderitemservice.dto.OrderItem;
import com.example.orderitemservice.repository.OrderItemRepository;

@Service
public class OrderItemServiceImpl implements OrderItemServiceI {

	@Autowired
	private OrderItemRepository orderItemRepository;

	@Override
	public List<OrderItem> retrieveOrderItems() {
		return orderItemRepository.findAll();

	};

	@Override
	public OrderItem createOrder(OrderItem order) {
		if (orderItemRepository.createOrderItem(order) == 1) {
			return order;
		} else {
			throw new RuntimeException();
		}
	}
}
