package com.javachallenges;

/** See the answer and concepts on nobugsproject.com */
public class ArrayChallenge {
    	//DoYourBest
	public static void main(String args[]) {
        try {
            String[] arr[] = new String[10][2];
            arr[0][0] = null;
            arr[2][2] = "one";
            arr[1][1] = "two";
            System.out.print(arr[2]);
        } catch(NullPointerException nex) { 
            System.out.print("null pointer exception"); 
        } catch(Exception ex) {
            System.out.print("exception");
        }
    }
}
