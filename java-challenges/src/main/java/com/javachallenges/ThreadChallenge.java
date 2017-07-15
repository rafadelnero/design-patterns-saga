package com.javachallenges;

public class ThreadChallenge {
    // make your code powerful
    private int wolverineAdrenaline = 10;
    
    public static void main(String[] args) {
	ThreadChallenge thread = new ThreadChallenge();
	// The result will be on nobugsproject.com
	thread.new Motorcycle().start();
	thread.new Motorcycle().start();
	thread.new Motorcycle().start(); 
	thread.new Motorcycle().start();
	// Be the compiler, make your best
	System.out.println(thread.wolverineAdrenaline);
    }
    // NoBugsProject
    class Motorcycle extends Thread {
	
	@Override
	public void run() {
	    wolverineAdrenaline++;
	}
	
    }
    
}

