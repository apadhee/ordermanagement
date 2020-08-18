package com.example.orderservice;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.orderservice.controller.OrdersController;
import com.example.orderservice.dto.Orders;
import com.example.orderservice.service.OrdersServiceImpl;

@SpringBootTest
class OrderServiceApplicationTests {

	@MockBean
	OrdersController ordersController;

	@InjectMocks
	OrdersServiceImpl orderService;
	
	@Test
	public void testRetrieveOrders() {
		List<Orders> mockedResponse = new ArrayList<Orders>();
		Orders order = new Orders();
		order.setCustomerName("manoj");
		Orders order1 = new Orders();
		order1.setCustomerName("Akash");
		mockedResponse.add(order1);
		mockedResponse.add(order);
		when(ordersController.retrieveOrders()).thenReturn(mockedResponse);
	}

}
