package com.example.orderitemservice.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.orderitemservice.dto.OrderItem;
import com.example.orderitemservice.mapper.OrderItemMapper;

@Repository
public class OrderItemRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<OrderItem> findAll() {
        return jdbcTemplate.query("select * from orders_items", new OrderItemMapper());
    }
	
	public int createOrderItem(OrderItem orderItem) {
		return jdbcTemplate.update("insert into orders_items (productcode, productname, quantity) " + "values(?, ?, ?)",
				new Object[] { orderItem.getProductCode(), orderItem.getProductName(), orderItem.getQuantity()});
	}
}
