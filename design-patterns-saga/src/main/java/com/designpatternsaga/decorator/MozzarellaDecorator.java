package com.designpatternsaga.decorator;

public class MozzarellaDecorator extends PizzaDecorator {

	public MozzarellaDecorator(Pizza customPizza) {
		super(customPizza);
	}

	public String make() {
		return customPizza.make() + addMozzarella();
	}

	private String addMozzarella() {
		return " + Mozzarella";
	}
}
