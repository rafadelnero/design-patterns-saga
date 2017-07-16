package com.designpatternsaga.strategyfactory;


/**
 * Pre Calculate the contracts.
 * @author Rafael Del Nero
 */
public class BillingPreCalculation implements BillingService {

	public void execute(long idContract) {
		calculateContract(idContract);
	}
	
	public void calculateContract(long idContract) {
		System.out.println("PreCalculation was invoked!");
	}

}
