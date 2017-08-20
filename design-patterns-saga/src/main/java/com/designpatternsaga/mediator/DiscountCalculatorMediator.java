package com.designpatternsaga.mediator;

import java.math.BigDecimal;

public class DiscountCalculatorMediator {
	
	private BigDecimal productValue;
	
	private BigDecimal DISCOUNT_RATE = new BigDecimal("0.10");
	
	public DiscountCalculatorMediator(BigDecimal productValue) {
		this.productValue = productValue;
	}

	public BigDecimal calculate() {
		return productValue.subtract(productValue.multiply(DISCOUNT_RATE));
	}
	
}
