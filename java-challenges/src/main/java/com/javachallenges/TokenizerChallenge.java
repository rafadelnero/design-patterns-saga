package com.javachallenges;

import java.util.Scanner;
import java.util.regex.Pattern;

public class TokenizerChallenge {

    public static void main(String[] args) throws Exception {
	Scanner sc = new Scanner("ThisIsIt,theFinalString,NoBugsProject");
	// See the result on nobugsproject.com
	Pattern pattern = Pattern.compile("[^\\w*]");
	sc.useDelimiter(pattern);
	// Make your code powerful, make your best
	while (sc.hasNext()) {
	    System.out.println(sc.next());
	}

	sc.close();
    }
}
