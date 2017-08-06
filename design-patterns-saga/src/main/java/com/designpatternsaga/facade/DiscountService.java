package com.designpatternsaga.facade;

public class DiscountService {

	public void applyDiscount(Customer customer, Product product) {
		System.out.println("Applying discount for customer: " + customer.getName() +
				" product: " + product.getName());
	}

}
