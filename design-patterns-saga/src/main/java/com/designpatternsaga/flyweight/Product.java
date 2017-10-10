package com.designpatternsaga.flyweight;

/** 
 * Object to be kept in cache.
 */
class Product {
	private final String name;

	public Product(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}
}