package com.designpatternsaga.adapter;

import org.junit.Assert;
import org.junit.Test;

import com.designpatternsaga.adapter.bonusexample.LegacyProductAdapter;
import com.designpatternsaga.adapter.bonusexample.LegacyProductPOJO;
import com.designpatternsaga.adapter.bonusexample.LegacyProductService;
import com.designpatternsaga.adapter.bonusexample.Product;
import com.designpatternsaga.adapter.bonusexample.ProductService;

public class BonusAdapterTest {
	
	@Test
	public void legacyServiceAdapterTest() {
		LegacyProductPOJO legacyProduct = new LegacyProductService()
				.findLegacyProduct();
		
		Product adapter = new LegacyProductAdapter(legacyProduct);
		
		ProductService productService = new ProductService();
		productService.processProduct(adapter);
		
		Assert.assertTrue(adapter.isProcessed());
	}
	
}
