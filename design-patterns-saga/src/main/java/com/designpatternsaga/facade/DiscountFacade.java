package com.designpatternsaga.facade;

public class DiscountFacade {
	
	private CustomerService customerService = new CustomerService();
	private ProductService productService = new ProductService();
	private DiscountService discountService = new DiscountService();
	
	public boolean applyDiscount(ApplyDiscountRequest discountRequest) {
		Customer customer = customerService.findProductBy(discountRequest.getIdCustomer());
	
		Product product = productService.findProductBy(discountRequest.getIdProduct());
		
		discountService.applyDiscount(customer, product);
		boolean isDiscountApplied = true;
		
		return isDiscountApplied;
	}
	
}
