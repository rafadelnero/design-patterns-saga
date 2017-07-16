package com.designpatternsaga.abstractfactory;

public class EtheriumFactory extends VirtualCoinFactory {

	@Override
	public VirtualCoin getVirtualCoin(VirtualCoinType virtualCoinType) {
		switch (virtualCoinType) {
		case FRACTIONED:
			return new FractionedEtherium();
		case INTEGER:
			return new IntegerEtherium();
		}

		throw new IllegalArgumentException(virtualCoinType + " not found");
	}

	@Override
	public Validator getValidator(VirtualCoinType virtualCoinType) {
		return new EtheriumValidator();
	}

}
