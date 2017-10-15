package com.designpatternsaga.proxy;

public class ContractProductServiceImpl implements ContractProductService {

	public String contractProduct(Long idProduct) { 
		if (idProduct < 0) {
			throw new InvalidProductException();
		}
		
		return "Product contracted!";
	}

}
