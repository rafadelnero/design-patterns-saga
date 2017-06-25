package com.designpatternsaga.prototype;

public class ContractComplement implements Cloneable {

	private String complementName;
	
	private Integer qtdCustomers;
	
	public ContractComplement(String complementName, Integer qtdCustomers) {
		this.complementName = complementName;
		this.qtdCustomers = qtdCustomers;
	}

	public ContractComplement() {
		super();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String getComplementName() {
		return complementName;
	}

	public Integer getQtdCustomers() {
		return qtdCustomers;
	}

	public void setComplementName(String complementName) {
		this.complementName = complementName;
	}

	public void setQtdCustomers(Integer qtdCustomers) {
		this.qtdCustomers = qtdCustomers;
	}
}
