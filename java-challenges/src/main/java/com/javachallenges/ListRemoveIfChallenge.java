package com.javachallenges;

import java.util.ArrayList;
import java.util.List;

/** Soon you will see the answer on nobugsproject.com */
public class ListRemoveIfChallenge {
	// DoYourBest
	public static void main(String ... makeYourCodePowerful) {
		List<Integer> list = new ArrayList<>();
		list.add(22);
		list.add(23);
		list.add(10);
		list.add(12);
		list.add(13);
		list.add(0);
		list.removeIf(e->e==new Integer(12)
				||e.equals(new Integer(22)));
		
		System.out.println(list);
	}
}
