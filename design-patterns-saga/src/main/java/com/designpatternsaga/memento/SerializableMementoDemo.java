package com.designpatternsaga.memento;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableMementoDemo {

	public static Customer deserialize() {
		try (FileInputStream fileIn = new FileInputStream("customer.ser");
				ObjectInputStream in = new ObjectInputStream(fileIn);) {

			return (Customer) in.readObject();
		} catch (ClassNotFoundException | IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static void serialize(Customer customer) {
		try (FileOutputStream fileOut = new FileOutputStream("customer.ser");
				ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
			out.writeObject(customer);
		} catch (IOException i) {
			throw new RuntimeException(i);
		}
	}

}
