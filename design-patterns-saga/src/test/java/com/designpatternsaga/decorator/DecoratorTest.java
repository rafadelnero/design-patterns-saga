package com.designpatternsaga.decorator;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.junit.Assert;
import org.junit.Test;

public class DecoratorTest {

	@Test
	public void decoratorTest() {
		Pizza pizza = new TuscanyDecorator(
				new MozzarellaDecorator(new SimplePizza()));
		
		Assert.assertEquals("Base + Mozzarella + Tuscany", pizza.make());
	}
	
	@Test
	public void decoratorJavaAPITest() throws IOException {
		File file = new File("./output.txt");
		file.createNewFile();
		
		OutputStream stream = new FileOutputStream(file);
		
		DataOutputStream dataStream = new DataOutputStream(stream);
		dataStream.writeChars("text");
		dataStream.close();
		stream.close();
		
		file.delete();
	}

}
