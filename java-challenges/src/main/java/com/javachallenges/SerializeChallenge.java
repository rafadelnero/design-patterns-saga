package com.javachallenges;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/** See the answer on nobugsproject.com */
public class SerializeChallenge {
    public static void main(String[] args) throws 
    		IOException, ClassNotFoundException {
	// DoYourBest
	Xmen xmen = new Xmen();
	FileOutputStream fs = new FileOutputStream("SerTest.ser");
	ObjectOutputStream os = new ObjectOutputStream(fs);

	xmen.name = "Wolverine";
	xmen.power = "Healing and defensive powers";

	os.writeObject(xmen);
	os.close();

	FileInputStream fis = new FileInputStream("SerTest.ser");
	ObjectInputStream ois = new ObjectInputStream(fis);
	xmen = (Xmen) ois.readObject();
	System.out.println(xmen.name);
	System.out.println(xmen.power);
	ois.close();
    }
}

class Xmen implements Serializable { private static final 
    long serialVersionUID = 632L;
    String name; transient String power; }
