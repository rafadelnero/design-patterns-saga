package com.designpatternsaga.flyweight;

public class Order {
	private final int orderNumber;
	private final Product product;

	Order(int orderNumber, Product product) {
		this.orderNumber = orderNumber;
		this.product = product;
	}

	void processOrder() {
		System.out.println("Ordering " + product + 
				" for order number " + orderNumber);
	}
}