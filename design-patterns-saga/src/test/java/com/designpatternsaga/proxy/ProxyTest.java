package com.designpatternsaga.proxy;

import org.junit.Assert;
import org.junit.Test;

public class ProxyTest {
	
	public static final long INVALID_PRODUCT_ID = -1;
	public static final long VALID_PRODUCT_ID = 1;
	
	@Test(expected=InvalidProductException.class)
	public void proxyInvalidProductTest() {
		ContractProductService service = (ContractProductService)SecurityProxy
				.newInstance(new ContractProductServiceImpl());
		
		service.contractProduct(INVALID_PRODUCT_ID);
	}
	
	@Test
	public void proxyValidProductTest() {
		ContractProductService service = (ContractProductService)SecurityProxy
				.newInstance(new ContractProductServiceImpl());
		
		String result = service.contractProduct(VALID_PRODUCT_ID);
		
		Assert.assertEquals("Product contracted!", result);
	}
}
