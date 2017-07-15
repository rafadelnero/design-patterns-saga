package com.javachallenges;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/** Soon you will see the answers on nobugsproject.com */
public class ConsumerChallenge {
	// DoYourBest
	public static void main(String[] args) {
		List<String> castlevania = new ArrayList<>();
		castlevania.add("Dracula");
		castlevania.add("Alucard");
		castlevania.add("Trevor");
		
		List<String> castlevaniaResult = new ArrayList<>();
		
		Consumer<String> c1 = System.out::println;
		Consumer<String> c2 = castlevaniaResult::add;
		Consumer<String> c3 = c -> castlevaniaResult.removeIf
				(e -> e.matches("Trevor"));
		
		castlevania.forEach(c2.andThen(c1).andThen(c3));
		
		System.out.println(castlevaniaResult);
	}
	
}
