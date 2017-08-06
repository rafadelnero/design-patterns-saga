package com.designpatternsaga.facade;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FacadeTest {

	private DiscountFacade facade;

	@Before
	public void init() {
		facade = new DiscountFacade();
	}

	@Test
	public void applyDiscountTest() {
		boolean isDiscountApplied = facade.applyDiscount(new ApplyDiscountRequest(1L, 1L, 1L));

		Assert.assertTrue(isDiscountApplied);
	}

}
