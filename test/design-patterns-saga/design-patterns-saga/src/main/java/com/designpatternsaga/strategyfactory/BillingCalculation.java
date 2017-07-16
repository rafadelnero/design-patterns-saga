package com.designpatternsaga.strategyfactory;

/**
 * Calculate the contract.
 * @author Rafael Del Nero
 */
public class BillingCalculation implements BillingService {

	public void execute(long idContract) {
		calculateContract(idContract);
	}
	
	public void calculateContract(long idContract) {
		System.out.println("BillingCalculation was invoked");
	}

}
