package com.example.orderservice.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.orderservice.entity.Orders;
import com.example.orderservice.exception.OrderNotFoundException;
import com.example.orderservice.mapper.OrdersMapper;

@Repository
public class OrdersRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Orders> findAll() {
		return jdbcTemplate.query("select * from orders", new OrdersMapper());
	}

	public int createOrder(Orders order) {
		return jdbcTemplate.update(
				"insert into orders (customername, orderdate, shippingaddress, orderitems, total) "
						+ "values(?, ?, ?, ?, ?)",
						new Object[] { order.getCustomerName(), order.getOrderDate(), order.getShippingAddress(),
								order.getOrderItems(), order.getTotal() });
	}

	public Orders retrieveOrderInfo(String customerName) {
		Orders order = null;
		try {
			order = jdbcTemplate.queryForObject("select * from orders where customername = ?",
					new Object[] { customerName }, new OrdersMapper());
		} catch (EmptyResultDataAccessException erda) {
			throw new OrderNotFoundException("Customer record not present");
		}
		return order;
	}

}
