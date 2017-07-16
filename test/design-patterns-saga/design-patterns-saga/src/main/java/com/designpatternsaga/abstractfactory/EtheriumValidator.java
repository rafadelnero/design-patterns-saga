package com.designpatternsaga.abstractfactory;

public class EtheriumValidator implements Validator {

	@Override
	public boolean isValid(VirtualCoin virtualCoin) {
		return false;
	}

}