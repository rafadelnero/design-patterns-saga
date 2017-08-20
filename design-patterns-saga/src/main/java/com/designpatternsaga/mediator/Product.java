package com.designpatternsaga.mediator;

import java.math.BigDecimal;

public class Product {
	
	private BigDecimal productValue;
	
	public Product(BigDecimal productValue) {
		this.productValue = productValue;
	}

	public BigDecimal calculateDiscount() {
		return new DiscountCalculatorMediator(productValue).calculate();
	}
	
}
