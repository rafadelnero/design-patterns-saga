package com.designpatternsaga.facade;

import java.util.Date;

public class CustomerService {
	
	public Customer findProductBy(long idCustomer) {
		return new Customer("Vader", "Imperial City", new Date());
	}

}
