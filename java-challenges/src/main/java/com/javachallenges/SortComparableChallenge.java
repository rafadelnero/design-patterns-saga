package com.javachallenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/** See the answer and the concepts behind the scenes 
 *  on nobugsproject.com */
public class SortComparableChallenge {
    // Make your best
    public static void main(String[] args) {
	Set<Simpson> set = new TreeSet<>(); 
	set.add(new Simpson("Homer"));
	set.add(new Simpson("Marge"));
	set.add(new Simpson("Lisa"));
	set.add(new Simpson("Bart"));
	set.add(new Simpson("Maggie"));
	
	List<Simpson> list = new ArrayList<>();
	list.addAll(set);
	Collections.reverse(list);
	list.forEach(System.out::println);
    }
    
    static class Simpson implements Comparable<Simpson> {
	String name;
	
	public Simpson(String name) { this.name = name; }

	@Override
	public int compareTo(Simpson simpson) {
	    return simpson.name.compareTo(this.name);
	}
	
	@Override
	public String toString() { return this.name; }
    }
}
