package com.designpatternsaga.chainofresponsibility;

import java.math.BigDecimal;

public class BasicDiscount extends Handler {

	public static BigDecimal minimalValue = new BigDecimal("10000");

	@Override
	public Response handleRequest(Request request) {
		if (request.getCustomerSalesAmount().compareTo(ModerateDiscount.minimalValue) < 0) {
			System.out.println("Execute some business logic here");

			return new Response(DiscountType.BASIC);
		} else {
			return successor.handleRequest(request);
		}
	}

}
