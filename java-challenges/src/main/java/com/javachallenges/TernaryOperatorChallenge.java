package com.javachallenges;

/** Soon you will see the answer on 
 	nobugsproject.com  */
public class TernaryOperatorChallenge {
    // DoYourBest
    public static void main(String[] args) {
	Integer i = 42;
	
	String s = (i < 40) ? "bestProjects" : (i > 50) ? 
		"powerfulCode" : "noBugs";
	
	s += (i < 42) ? "BestProgrammingPractices" : 
	    (i < 30) ? (i > 41) : "noStress";
	
	System.out.println(s);
    }
}
