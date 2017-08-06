package com.designpatternsaga.facade;

import java.util.Date;

public class Customer {
	
	private String name;
	private String address;
	private Date birthDate;
	
	public Customer(String name, String address, Date birthDate) {
		super();
		this.name = name;
		this.address = address;
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public Date getBirthDate() {
		return birthDate;
	}
	
}
