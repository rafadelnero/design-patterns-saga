package com.designpatternsaga.prototype;

import java.math.BigDecimal;

public class Contract implements Cloneable {

	private long idContract;

	private String name;

	private ContractComplement contractComplement;

	private BigDecimal contractValue;

	public Contract(long idContract, String name, ContractComplement contractComplement, BigDecimal contractValue) {
		this.idContract = idContract;
		this.name = name;
		this.contractComplement = contractComplement;
		this.contractValue = contractValue;
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

	public long getIdContract() {
		return idContract;
	}

	public String getName() {
		return name;
	}

	public ContractComplement getContractComplement() {
		return contractComplement;
	}

	public BigDecimal getContractValue() {
		return contractValue;
	}

	public void setContractComplement(ContractComplement contractComplement) {
		this.contractComplement = contractComplement;
	}

	public void setIdContract(long idContract) {
		this.idContract = idContract;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setContractValue(BigDecimal contractValue) {
		this.contractValue = contractValue;
	}

}
