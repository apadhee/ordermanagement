package com.example.orderservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.orderservice.entity.Orders;
import com.example.orderservice.repository.OrdersRepository;

@Service
public class OrdersService {

	@Autowired
	private OrdersRepository orderRepository;
	
	public List<Orders> retrieveOrders() {
		return orderRepository.findAll();
		
	};
	
	public Orders createOrder(Orders order) {
		 if(orderRepository.createOrder(order) == 1) {
			 return order;
		 }
		 else {
			 throw new RuntimeException();
		 }
	}

	public Orders retrieveOrderInfo(String customerName) {
		return orderRepository.retrieveOrderInfo(customerName);
	}
}
