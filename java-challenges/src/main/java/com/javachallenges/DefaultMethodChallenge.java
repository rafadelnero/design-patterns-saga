package com.javachallenges;

/** Soon you will see the answers on nobugsproject.com */
public class DefaultMethodChallenge {
	// DoYourBest
	public static void main(String[] args) {
		Jofrey jofrey = new Jofrey() {
			@Override
			public void kill() {
				Jofrey.super.kill();
			}
		};

		jofrey.kill();
	}

	interface Cersei {
		default void kill() {
			System.out.println("When you play the "
					+ "Game of Thrones, you win or die");
		}
	}

	interface Jofrey extends Cersei {
		default void kill() {
			System.out.println("Kill them all!");
		}
	}
}
