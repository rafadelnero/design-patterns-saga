package com.javachallenges;

import java.util.Arrays;

/** Soon there will be the answer on nobugsproject.com */
public class BinarySearchChallenge {
    //DoYourBest
    static String[] marvel = { "Spiderman", "Venom", "Carnage", "Mysterio" };

    public static void main(String[] args) {
	Arrays.sort(marvel);
	
	System.out.println(marvel);
	System.out.println(Arrays.binarySearch(marvel, "XMary Jane"));
	System.out.println(marvel[Arrays.binarySearch(marvel, "Carnage")]);
	System.out.println(Arrays.binarySearch(marvel, "Lizard"));
	System.out.println(Arrays.binarySearch(marvel, "ACrime Master"));
    }
    
}
