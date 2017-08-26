package com.designpatternsaga.memento;

import java.io.Serializable;

/** Originator */
public class Customer implements Serializable {
	
	private static final long serialVersionUID = 574314732983681621L;
	private String name;
	private String address;
	private String phone;
	
	public Customer(String name, String address, String phone) {
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String toString() {
		return name + " : " + phone;
	}
	
	public CustomerMemento save() {
		return new CustomerMemento(name, phone);
	}
	
	public void revert(CustomerMemento customer) {
		this.name = customer.getName();
		this.phone = customer.getPhone();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		return true;
	}

}