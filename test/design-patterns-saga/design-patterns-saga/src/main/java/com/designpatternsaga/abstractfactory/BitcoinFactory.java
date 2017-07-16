package com.designpatternsaga.abstractfactory;

public class BitcoinFactory extends VirtualCoinFactory {
	 
	@Override
	public VirtualCoin getVirtualCoin(VirtualCoinType virtualCoinType) {
		switch(virtualCoinType) {
			
		case FRACTIONED: 
			return new FractionedBitcoin();
		
		case INTEGER:
			return new IntegerBitcoin();
		default:
			throw new IllegalArgumentException("Card type not found.");
		}
	}
	
	public Validator getValidator(VirtualCoinType virtualCoinType) {
		switch(virtualCoinType) {
		
		case FRACTIONED: 
			return new FractionedBitcoinValidator();
		
		case INTEGER:
			return new IntegerBitcoinValidator();
		default:
			throw new IllegalArgumentException("Card type not found.");
		}
	}
	
}
