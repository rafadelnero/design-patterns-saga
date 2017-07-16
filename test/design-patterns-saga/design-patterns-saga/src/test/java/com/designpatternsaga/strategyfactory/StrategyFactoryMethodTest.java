package com.designpatternsaga.strategyfactory;

import org.junit.Assert;
import org.junit.Test;

public class StrategyFactoryMethodTest {
	
	private static final long idContract = 1;
	
	@Test
	public void invokePreCalculationTest() {
		BillingService billingService = new BillingServiceFactory(BillingEnum.PRE_CALCULATION.getCode()).getService();
		
		billingService.execute(idContract);
		Assert.assertTrue(billingService instanceof BillingPreCalculation);
	}
	
	@Test
	public void invokeCalculationTest() {
		BillingService billingService = new BillingServiceFactory(BillingEnum.CALCULATION.getCode()).getService();
		
		billingService.execute(idContract);
		Assert.assertTrue(billingService instanceof BillingCalculation);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void notExistentCommandTest() {
		new BillingServiceFactory("777").getService();
	}
	
}
