package com.designpatternsaga.adapter.bonusexample;

public class LegacyProductService {

	public LegacyProductPOJO findLegacyProduct() {
		return new LegacyProductPOJO().buildDefault();
	}
	
}
