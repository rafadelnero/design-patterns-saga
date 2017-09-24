package com.designpatternsaga.decorator;

public class TuscanyDecorator extends PizzaDecorator {

	public TuscanyDecorator(Pizza customPizza) {
		super(customPizza);
	}

	public String make() {
		return customPizza.make() + addTuscany();
	}
	
	private String addTuscany() {
		return " + Tuscany";
	}
	
}
