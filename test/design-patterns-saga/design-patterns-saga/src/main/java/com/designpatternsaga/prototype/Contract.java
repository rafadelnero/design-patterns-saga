package com.designpatternsaga.prototype;

import java.math.BigDecimal;

public class Contract implements Cloneable {

	private long id;

	private String name;

	private ContractComplement contractComplement;

	private BigDecimal price;

	public Contract(long id, String name, 
			ContractComplement contractComplement, BigDecimal price) {
		this.id = id;
		this.name = name;
		this.contractComplement = contractComplement;
		this.price = price;
	}

	public Contract() {
		super();
	}

	@Override
	protected Object clone() {
		Contract clonedContract;
		try {
			clonedContract = (Contract) super.clone();
			clonedContract.contractComplement = (ContractComplement) contractComplement.clone();
			return clonedContract;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ContractComplement getContractComplement() {
		return contractComplement;
	}

	public void setContractComplement(ContractComplement contractComplement) {
		this.contractComplement = contractComplement;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
}
