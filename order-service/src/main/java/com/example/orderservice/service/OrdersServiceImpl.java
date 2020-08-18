package com.example.orderservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.orderservice.dto.Orders;
import com.example.orderservice.repository.OrdersRepository;

@Service
public class OrdersServiceImpl implements OrdersServiceI {

	@Autowired
	private OrdersRepository orderRepository;

	@Override
	public List<Orders> retrieveOrders() {
		return orderRepository.findAll();

	};

	@Override
	public Orders createOrder(Orders order) {
		if (orderRepository.createOrder(order) == 1) {
			return order;
		} else {
			throw new RuntimeException();
		}
	}

	@Override
	public Orders retrieveOrderInfo(String customerName) {
		return orderRepository.retrieveOrderInfo(customerName);
	}

	public Orders retrieveOrder(Integer id) {
		return orderRepository.retrieveOrder(id);
	}
}
