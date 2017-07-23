package com.designpatternsaga.templatemethod;

import org.junit.Assert;
import org.junit.Test;

public class TemplateMethodTest {

	private static final String USER_NAME = "Juggy";

	@Test
	public void executeCustomerLogTest() {
		UserActionsLog customerLog = new CustomerRegisterLog(USER_NAME);  
		
		customerLog.generateLog();
		
		Assert.assertTrue(customerLog.isLogCreated());
	}

	@Test
	public void executeCompanyReceiptTest() {
		UserActionsLog companyReceiptLog = new CompanyReceiptLog(USER_NAME);  
		
		companyReceiptLog.generateLog();
		
		Assert.assertTrue(companyReceiptLog.isLogCreated());
	}
	
}
