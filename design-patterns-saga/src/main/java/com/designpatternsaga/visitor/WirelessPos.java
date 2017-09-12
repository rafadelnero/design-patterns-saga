package com.designpatternsaga.visitor;

public class WirelessPos implements CardDevice {
	@Override
	public void accept(CardDeviceVisitor visitor) {
		visitor.visit(this);
	}
	
	@Override
	public String toString() {
		return getClass().getCanonicalName();
	}
}
