package com.example.orderservice.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.orderservice.entity.Orders;

public class OrdersMapper implements RowMapper<Orders>{

	
	@Override
	public Orders mapRow(ResultSet rs, int arg1) throws SQLException {
		Orders order = new Orders();
		order.setCustomerName(rs.getString("customername"));
		order.setOrderDate(rs.getString("orderdate"));
		order.setOrderItems(rs.getString("orderitems"));
		order.setShippingAddress(rs.getString("shippingaddress"));
		order.setTotal(rs.getInt("total"));
		return order;
	}

	
}
