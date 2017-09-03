package com.designpatternsaga.visitor.badexample;

public class Mobile implements CardDevice {
	@Override
	public double calculateShipping() {
		return 6;
	}
}
