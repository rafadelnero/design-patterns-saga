package com.designpatternsaga.command;

import java.util.List;

public class ApplyAllDiscountsCommand implements Command {

	private List<Discount> discounts;
	
	public ApplyAllDiscountsCommand(List<Discount> discounts) {
		this.discounts = discounts;
	}
	
	@Override
	public void execute() {
		discounts.forEach(e -> new ApplyDiscountCommand(e).execute());
	}

}
