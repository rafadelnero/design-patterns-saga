package com.javachallenges;

public class EnumChallenge {
    public static void main(String[] args) {
	DragonBalls dragonBall1 = DragonBalls.FIFTH;
	DragonBalls dragonBall2 = DragonBalls.SECOND;

	DragonBalls dragonBalls [] = DragonBalls.FIRST.
		SECOND.THIRD.FOURTH.SIXTH.invokeShenLong();

	for (DragonBalls dragonBall : dragonBalls) {
	    if (dragonBall1.equals(dragonBall))
		break;
	    dragonBall2 = dragonBall1;
	} // See the answer and the source-code on nobugsproject.com
	System.out.println((dragonBall2 == dragonBall1) ? 
		"Same dragon ball" : "new Dragonball");
	System.out.println(dragonBall2); // Make your best
    }

    enum DragonBalls implements Invoker {
	FIRST, SECOND, THIRD, FOURTH, FIFTH, SIXTH, SEVENTH;

	public DragonBalls[] invokeShenLong() {
	    return DragonBalls.values();
	}
    };

    interface Invoker {
	DragonBalls[] invokeShenLong();
    }
}
