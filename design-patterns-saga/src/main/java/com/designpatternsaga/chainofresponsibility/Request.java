package com.designpatternsaga.chainofresponsibility;

import java.math.BigDecimal;

public class Request {
	
	private BigDecimal customerSalesAmount = BigDecimal.ZERO;

	public Request(BigDecimal customerSalesAmount) {
		this.customerSalesAmount = customerSalesAmount;
	}

	public BigDecimal getCustomerSalesAmount() {
		return customerSalesAmount;
	}
	
}
