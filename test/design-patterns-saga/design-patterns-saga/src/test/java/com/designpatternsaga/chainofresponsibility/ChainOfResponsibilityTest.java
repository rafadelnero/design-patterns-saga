package com.designpatternsaga.chainofresponsibility;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class ChainOfResponsibilityTest {

	@Test
	public void verifyIfBasicDiscountWasAppliedTest() {
		Response response = new DiscountHandler().applyDiscount(new Request(new BigDecimal("20000")));

		Assert.assertEquals(response.getDiscountType(), DiscountType.BASIC);
	}

	@Test
	public void verifyIfModerateDiscountWasAppliedTest() {
		Response response = new DiscountHandler().applyDiscount(new Request(new BigDecimal("50000")));

		Assert.assertEquals(response.getDiscountType(), DiscountType.MODERATE);
	}

	@Test
	public void verifyIfVipDiscountWasAppliedTest() {
		Response response = new DiscountHandler().applyDiscount(new Request(new BigDecimal("100000")));

		Assert.assertEquals(response.getDiscountType(), DiscountType.VIP);
	}

	@Test
	public void verifyIfNoDiscountWasAppliedTest() {
		Response response = new DiscountHandler().applyDiscount(new Request(new BigDecimal("5000")));

		Assert.assertEquals(response.getDiscountType(), DiscountType.NO_DISCOUNT);
	}

}
