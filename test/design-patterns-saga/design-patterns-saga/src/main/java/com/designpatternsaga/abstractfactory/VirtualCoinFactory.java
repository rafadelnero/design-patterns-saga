package com.designpatternsaga.abstractfactory;

public abstract class VirtualCoinFactory {
	
	public static double BIT_COIN_VALUE = 2000;

	public static VirtualCoinFactory getVirtualCoinFactory(double moneyToInvest) {
		
		if(moneyToInvest >= BIT_COIN_VALUE) {
			return new BitcoinFactory();
		}
		else {
			return new EtheriumFactory();
		}
	}
	
	public abstract VirtualCoin getVirtualCoin(VirtualCoinType virtualCoinType);
		
	public abstract Validator getValidator(VirtualCoinType virtualCoinType);
}
