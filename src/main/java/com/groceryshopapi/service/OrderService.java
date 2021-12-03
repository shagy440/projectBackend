package com.groceryshopapi.service;

import com.groceryshopapi.domain.Order;

public interface OrderService {
	public Order saveOrUpdate(Order order);
	public Iterable<Order> findAllOrders();
	public Order findOrderByOrderId(String orderId);
	public void deleteOrderByOrderId(String orderId);
		
	
}
