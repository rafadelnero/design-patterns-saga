package com.designpatternsaga.abstractfactory;

public class IntegerBitcoinValidator implements Validator {

	@Override
	public boolean isValid(VirtualCoin creditCard) {
		return true;
	}

}
