package com.javachallenges;

/** Soon you will see the answer on nobugsproject.com */
public class GenericsCastChallenge {
    	// DoYourBest
	static <Ditto> Ditto cast(Object anyPokemon) { // ERROR1
		return (Ditto) anyPokemon;
	}
	// What the result will be?
	public static void main(String[] args) {
		Object charmander = 10;
		int pikachu = 10;
		Integer wartortle = 10;

		Integer mewtwo = (Integer) 89898989;

		Integer pokeball1 = cast(charmander);
		Integer pokeball2 = cast(pikachu); 
		Integer pokeball3 = cast(wartortle); 
		String pokeball4 = cast(mewtwo);
		System.out.printf("p1 = %d, p2 = %d, p3 = %d, p4 = %d", pokeball1, 
			pokeball2, pokeball3, pokeball4);
	}
}
