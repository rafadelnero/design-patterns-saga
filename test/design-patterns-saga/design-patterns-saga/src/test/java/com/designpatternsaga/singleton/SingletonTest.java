package com.designpatternsaga.singleton;

import org.junit.Assert;
import org.junit.Test;

public class SingletonTest {
	
	@Test
	public void verifyIfTheInstancesAreTheSame() {
		Logger firstLog = Logger.getInstance();
		Logger secondLog = Logger.getInstance();
		Logger thirdLog = Logger.getInstance();
		
		Assert.assertEquals(firstLog, secondLog);
		Assert.assertEquals(secondLog, thirdLog);
	}
	
}
