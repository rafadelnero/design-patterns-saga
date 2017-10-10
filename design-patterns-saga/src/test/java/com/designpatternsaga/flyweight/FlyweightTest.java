package com.designpatternsaga.flyweight;

import org.junit.Assert;
import org.junit.Test;

public class FlyweightTest {

	@Test
	public void flyweightTest() {
		InventorySystem inventory = new InventorySystem();

		inventory.executeOrder("AlienWare laptop", 2500);
		inventory.executeOrder("SkullCandy HeadPhones", 150);
		inventory.executeOrder("Playstation 5", 500);
		inventory.executeOrder("SkullCandy HeadPhones", 130);
		inventory.executeOrder("AlienWare laptop", 3000);
		inventory.executeOrder("Playstation 5", 600);

		inventory.process();

		Assert.assertEquals(3, inventory.getTotalProducts());
	}

	@Test
	public void flyweightJavaApiExampleTest() {
		Integer firstInt = Integer.valueOf(5);

		Integer secondInt = Integer.valueOf(5);

		Integer thirdInt = Integer.valueOf(10);
		
		Assert.assertTrue(firstInt == secondInt);
		Assert.assertFalse(secondInt == thirdInt);
	}

}
