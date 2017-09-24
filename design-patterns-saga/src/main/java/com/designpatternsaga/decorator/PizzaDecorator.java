package com.designpatternsaga.decorator;

public abstract class PizzaDecorator implements Pizza {

	protected Pizza customPizza;

	public PizzaDecorator(Pizza customPizza) {
		this.customPizza = customPizza;
	}

	public String make() {
		return customPizza.make();
	}
	
}
