package com.designpatternsaga.visitor;

import org.junit.Assert;
import org.junit.Test;

import com.designpatternsaga.visitor.badexample.CardDeviceOrder;
import com.designpatternsaga.visitor.badexample.Mobile;
import com.designpatternsaga.visitor.badexample.WiredPos;
import com.designpatternsaga.visitor.badexample.WirelessPos;

public class BadExampleVisitorTest {
	
	public static final double EXPECTED_SHIPPING_COST = 22.0;
	
	@Test
	public void visitorBadExampleTest() {
		CardDeviceOrder order = new CardDeviceOrder();
		order.addPart(new Mobile());
		order.addPart(new WiredPos());
		order.addPart(new WirelessPos());
		
		double shippingCost = order.calculateShipping();
		
		Assert.assertTrue(EXPECTED_SHIPPING_COST == shippingCost);
	}
	
}
