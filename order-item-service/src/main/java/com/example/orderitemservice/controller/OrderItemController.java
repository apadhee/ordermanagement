package com.example.orderitemservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.orderitemservice.dto.OrderItem;
import com.example.orderitemservice.dto.Orders;
import com.example.orderitemservice.proxy.OrderControllerProxy;
import com.example.orderitemservice.service.OrderItemServiceImpl;

@RestController
public class OrderItemController {

	@Autowired
	private OrderItemServiceImpl orderItemService;
	
	@Autowired
	private OrderControllerProxy orderControllerProxy;
	
	@GetMapping("/orderItems")
	public List<OrderItem> retrieveOrderItems() {
		return orderItemService.retrieveOrderItems();
	}
	
	@PostMapping("/orderItem")
	public OrderItem createOrderItem(@RequestBody OrderItem orderItem) {
		return orderItemService.createOrder(orderItem);
	}
	
	//1. Feign Client for inter-service communication through Eureka
	@GetMapping(value = "/orderItem/orders/{customer}", produces = "application/json")
	public Orders retrieveOrderInfo(@PathVariable("customer") String customerName) {
		return orderControllerProxy.retrieveOrderInfo(customerName);
	}
}
