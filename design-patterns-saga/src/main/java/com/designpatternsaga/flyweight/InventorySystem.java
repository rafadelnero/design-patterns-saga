package com.designpatternsaga.flyweight;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventorySystem {
	
	private final Portfolio portfolio = new Portfolio();
	private final List<Order> orders = new CopyOnWriteArrayList<Order>();
	
	void executeOrder(String productName, int orderNumber) {
		Product product = portfolio.lookup(productName);
		Order order = new Order(orderNumber, product);
		orders.add(order);
	}

	void process() {
		for (Order order : orders) {
			order.processOrder();
			orders.remove(order);
		}
	}

	int getTotalProducts() {
		return portfolio.totalProductsMade();
	}
}