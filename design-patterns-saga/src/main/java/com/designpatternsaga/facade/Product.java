package com.designpatternsaga.facade;

import java.math.BigDecimal;

public class Product {
	private long idProduct;
	private String name;
	private BigDecimal price;
	
	public Product(long idProduct, String name, BigDecimal price) {
		super();
		this.idProduct = idProduct;
		this.name = name;
		this.price = price;
	}

	public long getIdProduct() {
		return idProduct;
	}

	public String getName() {
		return name;
	}

	public BigDecimal getPrice() {
		return price;
	}
	
}
