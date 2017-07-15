package com.javachallenges;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

/** See the concepts behind the scenes
 * on nobugsproject.com */
public class FilterChallenge {
	// DoYourBest
	public static void main(String... java) {
		List<Integer> list1 = Arrays.asList(3, 43, 33, 787);
		List<Integer> list2 = Arrays.asList(1, 2);
		List<Integer> list3 = Arrays.asList(390, 9, 10);

		List<List<Integer>> list = Arrays.asList(list1, list2, list3);

		Function<List<?>, Integer> size = List::size;
		Function<List<Integer>, Stream<Integer>> 
			flatMapper = l -> l.stream();

		list.stream().flatMap(flatMapper).forEach(System.out::println);
	}

}
