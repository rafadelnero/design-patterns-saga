package com.designpatternsaga.visitor;

public interface CardDeviceVisitor {
	void visit(WirelessPos wirelessPos);
	void visit(Mobile mobile);
	void visit(WiredPos wiredPos);
	void visit(CardDeviceOrder cardDeviceOrder);
}
