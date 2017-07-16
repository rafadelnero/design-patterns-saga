package com.designpatternsaga.command;

public class Discount {

	private boolean eligible;
	private boolean discountApplied;
	
	public Discount(boolean eligible) {
		this.eligible = eligible;
	}
	
	public void applyDiscount() {
		discountApplied = true;
		System.out.println("Discount applied!");
	}

	public boolean isDiscountApplied() {
		return discountApplied;
	}

	public boolean isEligible() {
		return eligible;
	}
	
	public void setEligible(boolean eligible) {
		this.eligible = eligible;
	}

}
