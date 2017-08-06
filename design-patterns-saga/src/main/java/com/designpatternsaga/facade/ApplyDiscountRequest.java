package com.designpatternsaga.facade;

public class ApplyDiscountRequest {

	private long idCustomer;
	private long idProduct;
	private long idDiscount;

	public ApplyDiscountRequest(long idCustomer, long idProduct, long idDiscount) {
		this.idCustomer = idCustomer;
		this.idProduct = idProduct;
		this.idDiscount = idDiscount;
	}
	
	public long getIdCustomer() {
		return idCustomer;
	}

	public long getIdProduct() {
		return idProduct;
	}

	public long getIdDiscount() {
		return idDiscount;
	}

}
