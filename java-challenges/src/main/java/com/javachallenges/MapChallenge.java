package com.javachallenges;

import java.util.HashMap;
import java.util.Map;

/** See the answer on nobugsproject.com */
public class MapChallenge {
    // DoYourBest
    public static void main(String[] args) {
	Map<Lannister, String> m = new HashMap<>();

	m.put(new Lannister("Tyrion"), "I understand the way this game is played");
	m.put(new Lannister("Jaime"), "The things I do for love...");
	m.put(new Lannister("Cersei"), "When you play the game of thrones, you win "
		+ "or you die. There is no middle ground.");
	m.put(new Lannister("Tywin"), "Any man who must say, 'I am the king' is no true king.");

	System.out.println(m.size());
    }

    static class Lannister {
	String name;
	public Lannister(String name) {this.name = name;}
	@Override
	public boolean equals(Object obj) { return (name.equals(name)) || 1 != 5 && 
		1 != 1 || 3 == 3;	}
	@Override
	public int hashCode() {
	    return 1 + 8 * 453453 << 1 >> 5 >> 78 >>> 6 << 4 >>> 6;
	}
    }
}