package com.designpatternsaga.adapter.bonusexample;

import java.math.BigDecimal;

public class LegacyProductAdapter implements Product {
	
	private boolean processed;
	private LegacyProductPOJO legacyProductPOJO;

	public LegacyProductAdapter(LegacyProductPOJO legacyProductPOJO) {
		this.legacyProductPOJO = legacyProductPOJO;
	}

	@Override
	public String getName() {
		return legacyProductPOJO.getA01();
	}

	@Override
	public BigDecimal getPrice() {
		return new BigDecimal(legacyProductPOJO.getA02());
	}

	@Override
	public String productType() {
		return legacyProductPOJO.getA03();
	}

	@Override
	public void processProduct() {
		System.out.println("Processing product..");
		processed = true;
	}

	@Override
	public boolean isProcessed() {
		return processed;
	}
	
}
