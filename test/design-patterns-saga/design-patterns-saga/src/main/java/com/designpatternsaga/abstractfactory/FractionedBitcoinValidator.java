package com.designpatternsaga.abstractfactory;

public class FractionedBitcoinValidator implements Validator {
	
	@Override
	public boolean isValid(VirtualCoin virtualCoin) {
		return false;
	}
	
}
