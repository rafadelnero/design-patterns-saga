package com.designpatternsaga.visitor.badexample;

public class WiredPos implements CardDevice {
	@Override
	public double calculateShipping() {
		return 9;
	}
}
