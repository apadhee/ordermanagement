package com.example.orderservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.orderservice.entity.Orders;
import com.example.orderservice.service.OrdersService;

@RestController
public class OrdersController {
	
	@Autowired
	private OrdersService ordersService;
	
	@GetMapping("/orders")
	public List<Orders> retrieveOrders() {
		return ordersService.retrieveOrders();
	}
	
	@PostMapping("/order")
	public Orders createOrder(@Validated @RequestBody Orders order) {
		return ordersService.createOrder(order);
	}
	
	@GetMapping("/orders/{customer}")
	public Orders retrieveOrderInfo(@PathVariable("customer") String customerName) {
		return ordersService.retrieveOrderInfo(customerName);
	}
}
