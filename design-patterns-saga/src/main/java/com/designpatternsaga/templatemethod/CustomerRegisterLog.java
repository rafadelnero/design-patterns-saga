package com.designpatternsaga.templatemethod;

public class CustomerRegisterLog extends UserActionsLog {

	public CustomerRegisterLog(String userName) {
		super(userName);
	}

	@Override
	public void generateBodyLog() {
		System.out.println("Generating Customer body log..");
	}
	
}
