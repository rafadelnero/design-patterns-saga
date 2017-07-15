package com.javachallenges;

public class LogicalOperatorsChallenge {
    
    /**
     * What will be the result?
     */
    public static void main(String[] args) {
	// The result will be on nobugsproject.com
	int spiderMan =10; // Get the source-code on nobugsproject.com
	int venom = 5;
	
	int carnage = 50; // Answer this challenge just reading it
	
	if (spiderMan == 11 & venom++ == 5) { 
	    venom++;
	} // You must be the compiler 
	
	if (++carnage == 50 | spiderMan++ == 11 | spiderMan++ == 12 
		| spiderMan++ == 13 | spiderMan++ == 14) {
	    venom++;
	}
	
	if (++spiderMan == 14 | spiderMan++ == 15 & venom++ == 6 & spiderMan == 13) {
	    spiderMan++;
	}
	
	System.out.println(spiderMan + venom + carnage);
    }
    
}	
