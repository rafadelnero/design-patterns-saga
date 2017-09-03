package com.designpatternsaga.visitor;

import java.util.List;

public class CardDeviceShippingVisitor implements CardDeviceVisitor {

	double shippingValue = 0;

	@Override
	public void visit(WirelessPos wirelessPos) {
		System.out.println("Calculating Wireless Pos shipping.");
		shippingValue += 15;
	}

	@Override
	public void visit(Mobile mobile) {
		System.out.println("Calculating Mobile shipping");
		shippingValue += 3;
	}

	@Override
	public void visit(WiredPos wiredPos) {
		System.out.println("Calculating Wired Pos shipping.");
		shippingValue += 9;
	}

	@Override
	public void visit(CardDeviceOrder order) {
		System.out.println("If they bought more than 3 things " 
				+ "there will be a discount in the shipping.");
		List<CardDevice> cardDevices = order.getCardDevices();
		if (cardDevices.size() > 3) {
			shippingValue -= 5;
		}
		System.out.println("Shipping amount is: " + shippingValue);
	}

	public double getShippingValue() {
		return shippingValue;
	}
}
