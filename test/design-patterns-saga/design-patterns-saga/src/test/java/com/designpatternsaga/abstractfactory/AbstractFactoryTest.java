package com.designpatternsaga.abstractfactory;

import org.junit.Assert;
import org.junit.Test;

public class AbstractFactoryTest {

	public static final double BITCOIN_VALUE = 2000;
	public static final double ETHERIUM_VALUE = 1000;

	@Test
	public void checkBitcoinCreationTest() {
		VirtualCoinFactory abstractFactory = VirtualCoinFactory.getVirtualCoinFactory(BITCOIN_VALUE);

		VirtualCoin integerBitcoin = abstractFactory.getVirtualCoin(VirtualCoinType.INTEGER);
		VirtualCoin fractionedBitcoin = abstractFactory.getVirtualCoin(VirtualCoinType.FRACTIONED);

		Assert.assertEquals("IntegerBitcoin", integerBitcoin.getClass().getSimpleName());
		Assert.assertEquals("FractionedBitcoin", fractionedBitcoin.getClass().getSimpleName());
	}
	
	@Test
	public void checkEtheriumCreationTest() {
		VirtualCoinFactory abstractFactory = VirtualCoinFactory.getVirtualCoinFactory(ETHERIUM_VALUE);

		VirtualCoin integerEtherium = abstractFactory.getVirtualCoin(VirtualCoinType.INTEGER);
		VirtualCoin fractionedEtherium = abstractFactory.getVirtualCoin(VirtualCoinType.FRACTIONED);
		
		Assert.assertEquals("IntegerEtherium", integerEtherium.getClass().getSimpleName());
		Assert.assertEquals("FractionedEtherium", fractionedEtherium.getClass().getSimpleName());
	}
	
}
