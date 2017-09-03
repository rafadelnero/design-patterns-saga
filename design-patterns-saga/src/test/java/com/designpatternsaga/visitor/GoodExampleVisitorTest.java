package com.designpatternsaga.visitor;

import org.junit.Assert;
import org.junit.Test;

public class GoodExampleVisitorTest {
		
	public static final double EXPECTED_SHIPPING_COST = 27.0;
	
	@Test
	public void visitorGoodExampleTest() {
		CardDeviceOrder order = new CardDeviceOrder();
		order.addPart(new WirelessPos());
		order.addPart(new Mobile());
		order.addPart(new WiredPos());
		
		CardDeviceShippingVisitor shipping 
			= new CardDeviceShippingVisitor();
		
		order.accept(shipping);
		order.accept(new CardDeviceDisplayVisitor());
		
		Assert.assertTrue(EXPECTED_SHIPPING_COST == 
				shipping.getShippingValue());
	}
	
}
