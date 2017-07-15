package com.javachallenges;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/** Soon you can check out the answer on nobugsproject.com */
public class QueueCollectionChallenge {
    // DoYourBest
    public static int CAPACITY = 5;

    public static void main(String[] args) {
	Queue<String> breakingBadQueue = 
		new ArrayBlockingQueue<>(CAPACITY);
	
	breakingBadQueue.add("Heisenberg");
	breakingBadQueue.add("Jesse");
	breakingBadQueue.offer("Gus");
	breakingBadQueue.offer("Walter White Junior");
	breakingBadQueue.offer("Saul Goodman");
	breakingBadQueue.offer("Hank");
	
	String character = breakingBadQueue.peek();
	String anotherCharacter = breakingBadQueue.poll(); 
	
	ArrayBlockingQueue<String> arrayBlockingList = 
		(ArrayBlockingQueue<String>) breakingBadQueue;
	arrayBlockingList.offer(character);
	arrayBlockingList.offer(anotherCharacter);
	
	System.out.println(breakingBadQueue);
    }
}
