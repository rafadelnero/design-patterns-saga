package com.designpatternsaga.iterator;

import java.util.Iterator;

public class ProductRepository implements Iterable<String> {

	private String[] products;
	private int index;

	public ProductRepository() {
		products = new String[10];
		index = 0;
	}

	public void add(String product) {
		if (index == products.length) {
			String[] largerProducts = new String[products.length + 5];
			System.arraycopy(products, 0, largerProducts, 0, products.length);
			products = largerProducts;
			largerProducts = null;
		}

		products[index++] = product;
	}
	
	@Override
	public Iterator<String> iterator() {
		return new Iterator<String>() {

			private int currentIndex = 0;

			@Override
			public boolean hasNext() {
				return currentIndex < products.length && products[currentIndex] != null;
			}

			@Override
			public String next() {
				return products[currentIndex++];
			}

			@Override
			public void remove() {
				System.arraycopy(products, currentIndex + 1, products, 
						currentIndex, products.length - 1);
			}

		};
	}
}