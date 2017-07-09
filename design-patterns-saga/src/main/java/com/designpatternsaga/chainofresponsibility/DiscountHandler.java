package com.designpatternsaga.chainofresponsibility;

public class DiscountHandler {
	
	public Response applyDiscount(Request request) {
		Handler noDiscount = new NoDiscount();
		Handler basic = new BasicDiscount();
		Handler moderate = new ModerateDiscount();
		Handler vip = new VipDiscount();
		
		noDiscount.setSucessor(basic);
		basic.setSucessor(moderate);
		moderate.setSucessor(vip);
		
		return noDiscount.handleRequest(request);
	}
	
}
