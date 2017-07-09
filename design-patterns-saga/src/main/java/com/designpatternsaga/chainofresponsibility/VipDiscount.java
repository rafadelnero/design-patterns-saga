package com.designpatternsaga.chainofresponsibility;

import java.math.BigDecimal;

public class VipDiscount extends Handler {

	public static BigDecimal minimalValue = new BigDecimal("100000");

	@Override
	public Response handleRequest(Request request) {
		if (request.getCustomerSalesAmount().compareTo(minimalValue) >= 0) {
			System.out.println("Execute some business logic here");
			
			return new Response(DiscountType.VIP);
		}
		
		throw new IllegalArgumentException("Invalid argument.");
	}

}
