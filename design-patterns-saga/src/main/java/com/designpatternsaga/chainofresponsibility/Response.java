package com.designpatternsaga.chainofresponsibility;

public class Response {
	
	private DiscountType discountType;

	public Response(DiscountType discountType) {
		this.discountType = discountType;
	}
	
	public DiscountType getDiscountType() {
		return discountType;
	}
	
}
