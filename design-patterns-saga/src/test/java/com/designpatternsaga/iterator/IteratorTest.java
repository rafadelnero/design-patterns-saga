package com.designpatternsaga.iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class IteratorTest {

	@Test
	public void customIteratorTest() {
		ProductRepository repo = new ProductRepository();

		repo.add("Guitar");
		repo.add("Notebook");
		repo.add("Tablet");

		Iterator<String> productIterator = repo.iterator();
		productIterator.remove();
		productIterator.remove();

		Assert.assertEquals(productIterator.next(), "Tablet");
	}

	@Test
	public void javaAPIIteratorTest() {
		Set<String> simpsons = new HashSet<>();

		simpsons.add("Homer");
		simpsons.add("Bart");
		simpsons.add("Margie");

		Iterator<String> simpsonsItr = simpsons.iterator();

		while (simpsonsItr.hasNext()) {
			String name = simpsonsItr.next();
			System.out.println(name);
			simpsonsItr.remove();
		}

		Assert.assertEquals(0, simpsons.size());
	}

}
