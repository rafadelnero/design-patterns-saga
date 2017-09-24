package com.designpatternsaga.decorator;

public class DressingDecorator extends PizzaDecorator {

	public DressingDecorator(Pizza customPizza) {
		super(customPizza);
	}

	public String make() {
		return customPizza.make() + addDressing();
	}
	
	private String addDressing() {
		return " + Tuscany";
	}
	
}
