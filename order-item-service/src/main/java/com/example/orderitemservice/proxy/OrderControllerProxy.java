package com.example.orderitemservice.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.orderitemservice.dto.Orders;

@FeignClient("order-service")
public interface OrderControllerProxy {

	@GetMapping("/orders/{customer}")
	public Orders retrieveOrderInfo(@PathVariable("customer") String customerName);
	
}
