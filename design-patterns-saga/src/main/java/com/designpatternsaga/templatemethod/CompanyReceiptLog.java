package com.designpatternsaga.templatemethod;

public class CompanyReceiptLog extends UserActionsLog {

	public CompanyReceiptLog(String userName) {
		super(userName);
	}

	@Override
	public void generateBodyLog() {
		System.out.println("Generating Company Receipt body log..");
	}
	
}
