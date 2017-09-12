package com.designpatternsaga.visitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardDeviceOrder implements CardDevice {
	
	private List<CardDevice> cardDevices = new ArrayList<>();
	
	public CardDeviceOrder() {
		super();
	}
	
	public void addPart(CardDevice cardDevice) {
		cardDevices.add(cardDevice);
	}
	
	public List<CardDevice> getCardDevices() {
		return Collections.unmodifiableList(cardDevices);
	}
	
	@Override
	public void accept(CardDeviceVisitor visitor) {
		for (CardDevice cardDevice : cardDevices) {
			cardDevice.accept(visitor);
		}
		visitor.visit(this);
	}
	
	@Override
	public String toString() {
		return getClass().getCanonicalName();
	}
	
	
}
