package com.designpatternsaga.prototype;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.BeanUtils;

public class PrototypeTest {
	
	public static final String COMPLEMENT_NAME = "ComplementContract";
	public static final int QTD_CUSTOMERS = 2;

	public static final long ID_CONTRACT = 1;
	public static final String CONTRACT_NAME = "";
	public static final BigDecimal CONTRACT_VALUE = new BigDecimal("300");
	
	@Test
	public void checkIfTheObjectWasClonedTest() {
		Contract contract = mockContract();
		
		Contract contractPrototype = (Contract) contract.clone();
		
		checkIfTheObjectsAreCloned(contract, contractPrototype);
	}
	
	@Test
	public void checkIfTheObjectWasCopiedByBeanUtilsTest() throws IllegalAccessException, InvocationTargetException {
		Contract contract = mockContract();
		
		Contract contractToBeCopied = new Contract();
		ContractComplement complementContractToBeCopied = new ContractComplement();
		
		BeanUtils.copyProperties(contract, contractToBeCopied);
		BeanUtils.copyProperties(contract.getContractComplement(), complementContractToBeCopied);
		
		contractToBeCopied.setContractComplement(complementContractToBeCopied);
		
		checkIfTheObjectsAreCloned(contract, contractToBeCopied);
	}
	
	private Contract mockContract() {
		ContractComplement complement = new ContractComplement(COMPLEMENT_NAME, QTD_CUSTOMERS);
		
		Contract contract = new Contract(ID_CONTRACT, CONTRACT_NAME, complement, CONTRACT_VALUE);
		return contract;
	}

	private void checkIfTheObjectsAreCloned(Contract contract, Contract contractToBeCopied) {
		Assert.assertTrue(contract.getId() == contractToBeCopied.getId());
		Assert.assertTrue(contract.getName().equals(contractToBeCopied.getName()));
		Assert.assertTrue(contract.getPrice().equals(contractToBeCopied.getPrice()));
		
		ContractComplement complement = contract.getContractComplement();
		ContractComplement copiedComplement = contractToBeCopied.getContractComplement();
		
		Assert.assertTrue(complement.getComplementName().equals(copiedComplement.getComplementName()));
		Assert.assertTrue(complement.getSpecificProductPrice().equals(copiedComplement.getSpecificProductPrice()));
		
		Assert.assertFalse(contract.equals(contractToBeCopied));
		Assert.assertFalse(contract.getContractComplement().equals(contractToBeCopied.getContractComplement()));
	}
	
}
