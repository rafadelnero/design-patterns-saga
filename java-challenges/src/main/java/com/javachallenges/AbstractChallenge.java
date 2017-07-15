package com.javachallenges;

public class AbstractChallenge {
    // May the force be with you
    static final  int FORCE = 10;
    
    // Go to nobugsproject.com to see the answers!
    public static void main(String[] args) {
	DarthVader darthVader = new DarthVader() {
	    // Make your best, NoBugsProject
	    public int getNumber(int number) {
		return number;
	    }
	};
	
	AbstractChallenge abstractChallenge = new AbstractChallenge();
	
	MasterYoda masterYoda =  abstractChallenge.new MasterYoda() {
	    public int getNumber(int number) {
		return number;
	    }
	};
	// Make your code powerful
	System.out.println(darthVader.getNumber(FORCE) + 
		masterYoda.getNumber(new Integer(FORCE)));
	System.out.println("The stronger Jedi is: " + (darthVader.getNumber(FORCE) > 
		masterYoda.getNumber(FORCE) ? "Darth Vader" : "Master Yoda"));
    }
    
    abstract class MasterYoda implements LukeSkywalker { public int 
	getNumber(Integer force) { return  force + 10; } }
    
    interface LukeSkywalker extends DarthVader { int getNumber(int force); }
    
    interface DarthVader{ int getNumber(int force);}
}
