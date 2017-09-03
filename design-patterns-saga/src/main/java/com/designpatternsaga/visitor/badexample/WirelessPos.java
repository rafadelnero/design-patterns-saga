package com.designpatternsaga.visitor.badexample;

public class WirelessPos implements CardDevice {
	@Override
	public double calculateShipping() {
		return 7;
	}
}
