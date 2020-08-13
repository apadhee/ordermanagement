package com.example.orderitemservice.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.orderitemservice.entity.OrderItem;


public class OrderItemMapper implements RowMapper<OrderItem>{

	@Override
	public OrderItem mapRow(ResultSet rs, int arg1) throws SQLException {
		OrderItem orderItem = new OrderItem();
		orderItem.setProductCode(rs.getString("productcode"));
		orderItem.setProductName(rs.getString("productname"));
		orderItem.setQuantity(rs.getInt("quantity"));
		return orderItem;
	}

}
