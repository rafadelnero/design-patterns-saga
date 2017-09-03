package com.designpatternsaga.visitor;

public class WiredPos implements CardDevice {
	@Override
	public void accept(CardDeviceVisitor visitor) {
		visitor.visit(this);
	}
}
