package com.designpatternsaga.visitor.badexample;

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

	public double calculateShipping() {
		double shippingCost = 0;
		for (CardDevice cardDevice : cardDevices) {
			shippingCost += cardDevice.calculateShipping();
		}
		return shippingCost;
	}
	
}
