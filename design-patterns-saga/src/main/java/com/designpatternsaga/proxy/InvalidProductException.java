package com.designpatternsaga.proxy;

public class InvalidProductException extends RuntimeException {

	private static final long serialVersionUID = -5415448783266469523L;
		
	@Override
	public String getMessage() {
		return "Invalid product.";
	}
}
