package com.designpatternsaga.strategyfactory;

/**
 * The Factory to invoke the correct Service based on the command.
 * @author Rafael Del Nero.
 */
public class BillingServiceFactory {
	
	private String command;
	
	public BillingServiceFactory(String command) {
		this.command = command;
	}

	public BillingService getService() {
		BillingEnum billingEnum = BillingEnum.parse(command);

		switch (billingEnum) {

		case PRE_CALCULATION:
			return new BillingPreCalculation();

		case CALCULATION:
			return new BillingCalculation();

		default:
			throw new IllegalArgumentException("The service does not exist.");
		}
	}

}
