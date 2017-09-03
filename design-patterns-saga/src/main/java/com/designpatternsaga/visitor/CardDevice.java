package com.designpatternsaga.visitor;

public interface CardDevice {
	public void accept(CardDeviceVisitor visitor);
}
