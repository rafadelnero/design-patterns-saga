package com.designpatternsaga.visitor;

public class CardDeviceDisplayVisitor implements CardDeviceVisitor {

	@Override
	public void visit(WirelessPos wirelessPos) {
		System.out.println("We have a: " +  wirelessPos);
	}

	@Override
	public void visit(Mobile mobile) {
		System.out.println("We have a: " + mobile);
	}

	@Override
	public void visit(WiredPos wiredPos) {
		System.out.println("We have: " + wiredPos);
	}

	@Override
	public void visit(CardDeviceOrder cardDeviceOrder) {
		System.out.println("We have an: "+ cardDeviceOrder);
	}

}
