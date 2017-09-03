package com.designpatternsaga.visitor;

public class Mobile implements CardDevice {
	@Override
	public void accept(CardDeviceVisitor visitor) {
		visitor.visit(this);
	}
}
