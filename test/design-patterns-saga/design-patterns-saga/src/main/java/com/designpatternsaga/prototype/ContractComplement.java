package com.designpatternsaga.prototype;

public class ContractComplement implements Cloneable {

	private String complementName;
	
	private Integer specificProductPrice;
	
	public ContractComplement() {
		super();
	}
	
	public ContractComplement(String complementName, Integer specificProductPrice) {
		this.complementName = complementName;
		this.specificProductPrice = specificProductPrice;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String getComplementName() {
		return complementName;
	}

	public void setComplementName(String complementName) {
		this.complementName = complementName;
	}

	public Integer getSpecificProductPrice() {
		return specificProductPrice;
	}

	public void setSpecificProductPrice(Integer specificProductPrice) {
		this.specificProductPrice = specificProductPrice;
	}

}
