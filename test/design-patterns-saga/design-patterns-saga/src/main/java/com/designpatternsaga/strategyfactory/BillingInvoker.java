package com.designpatternsaga.strategyfactory;

/**
 * Invoke the service through the command received.
 * @author Rafael Del Nero
 */
public class BillingInvoker {
	
	public void executeAction(String command) {
		int idContract = 1;
		
		new BillingServiceFactory(command).getService().execute(idContract);
	}
	
}
