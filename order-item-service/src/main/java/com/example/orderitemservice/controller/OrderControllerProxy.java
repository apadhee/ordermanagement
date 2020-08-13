package com.example.orderitemservice.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.orderitemservice.entity.Orders;

@FeignClient("order-service")
public interface OrderControllerProxy {

	@GetMapping("/orders/{customer}")
	public Orders retrieveOrderInfo(@PathVariable("customer") String customerName);
	
}
