package com.javachallenges;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/** Soon you can see the concepts 
 *    on nobugsproject.com  */
public class OptionalChallenge {
	// DoYourBest
	public static void main(String ... makeYourCodePowerful) {
		List<String> list = Arrays.asList("X", "Zero", 
				"Sigma", "Willy");
		
		Optional<String> op = list.stream().findFirst();
		Optional<String> op2 = list.stream().filter(
				e -> e.equals("Signa")).findAny();
		
		System.out.println(op.orElse(""));
		System.out.println(op2.orElse("Double"));
	}
}
