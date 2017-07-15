package com.javachallenges;

import java.util.function.Predicate;

/** Soon you will see the answers on nobugsproject.com */
public class PredicateChallenge {
	// DoYourBest
	public static void main(String[] ... makeYourCodePowerful) {
		Predicate<String> firstStark = s -> s.matches("[\\w|\\W]*"); 
		Predicate<String> secondStark = s -> s.matches("[\\w|\\W|\\d|$|]*");
		

		Predicate<String> finalStarkPredicate = firstStark.and(secondStark);
		
		System.out.println(finalStarkPredicate.test("Ned Stark 777 #$"));
	}
	
}
