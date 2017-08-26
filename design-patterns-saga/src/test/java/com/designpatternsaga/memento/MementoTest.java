package com.designpatternsaga.memento;

import org.junit.Assert;
import org.junit.Test;

public class MementoTest {
	
	/**
	 * With the Memento Pattern we can save the state of the object
	 *  and revert it easily. In this example we are adding 3 customers
	 *  into the Stack of the Caretake and reverting it until the 
	 *  the first customer that was added into the Stack.
	 */
	@Test
	public void mementoTest() {
		Caretaker caretaker = new Caretaker();

		Customer customer = new Customer("Juggy", "31, Fairview Close",
				"777-555-1212");
		
		caretaker.save(customer);

		customer.setPhone("777-555-8888");

		caretaker.save(customer);

		customer.setPhone("777-999-6666"); 

		caretaker.revert(customer);
		caretaker.revert(customer);

		Assert.assertEquals(new CustomerMemento("Juggy", "777-555-1212"),
				customer.save());
	}
	
	@Test
	public void mementoEverydayTest() {
		Customer customer = new Customer("Rafael", "31, Fairview Close",
				"777-555-7777");
		
		SerializableMementoDemo.serialize(customer);
		Customer newCustomer = SerializableMementoDemo.deserialize();

		Assert.assertEquals(customer, newCustomer);
	}
	
}
