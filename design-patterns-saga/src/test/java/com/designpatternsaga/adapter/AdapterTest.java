package com.designpatternsaga.adapter;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class AdapterTest {

	@Test
	public void checkIfValuesWereAdaptedTest() {
		CustomerService client = new CustomerService();

		List<Customer> employees = client.getEmployeeList();

		for (int i = 0; i < employees.size(); i++) {
			Customer customer = employees.get(i);
			Customer expectedCustomer = getExpectedResponse().get(i);

			Assert.assertEquals(customer.getId(), expectedCustomer.getId());
			Assert.assertEquals(customer.getFirstName(), expectedCustomer.getFirstName());
			Assert.assertEquals(customer.getLastName(), expectedCustomer.getLastName());
			Assert.assertEquals(customer.getEmail(), expectedCustomer.getEmail());
		}
	}

	private List<Customer> getExpectedResponse() {
		return Arrays.asList(new CustomerDB("1234", "Robert", "C. Martin", "bobMartin@cleancode.com"),
				new CustomerAdapterFromLegacyCode(new CustomerFromLegacyCode("777", "Java", 
						"Juggy", "juggy@java.com")),
				new CustomerAdapterCSV(new CustomerCSV("567,James,Gosling,jamesGosling@java.com")));
	}
	
	public void javaAPIAdapterExampleTest() {
		Integer[] arrayOfInts = new Integer[] { 42, 43, 44 };

		List<Integer> listOfInts = Arrays.asList(arrayOfInts);

		System.out.println(arrayOfInts);

		System.out.println(listOfInts);
	}

}
