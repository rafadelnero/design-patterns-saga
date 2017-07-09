package com.designpatternsaga.chainofresponsibility;

import java.math.BigDecimal;

public class ModerateDiscount extends Handler {
	
	public static BigDecimal minimalValue = new BigDecimal("50000");

	@Override
	public Response handleRequest(Request request) {
		if (request.getCustomerSalesAmount().compareTo(VipDiscount.minimalValue) < 0) {
			return new Response(DiscountType.MODERATE);
		} else {
			return successor.handleRequest(request);
		}
	}

}
