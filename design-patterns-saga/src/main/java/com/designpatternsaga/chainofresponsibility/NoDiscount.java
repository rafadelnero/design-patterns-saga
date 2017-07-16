package com.designpatternsaga.chainofresponsibility;

public class NoDiscount extends Handler {
	
	@Override
	public Response handleRequest(Request request) {
		if (request.getCustomerSalesAmount().compareTo(BasicDiscount.minimalValue) < 0) {
			return new Response(DiscountType.NO_DISCOUNT);
		} else {
			return successor.handleRequest(request);
		}
	}

}
