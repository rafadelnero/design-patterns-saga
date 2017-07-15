package com.javachallenges;

/** Soon see the answer on nobugsproject.com */
public class FlowControlChallenge {
		public static void main(String[] args) {
			// DoYourBest
			boolean isHomerFat = true;
			boolean isBartPrankster = true;
			
			String result = "";
			
			if (isHomerFat = false || (isBartPrankster = false)) {
				result += "1";
			} else if (isHomerFat || isBartPrankster) {
				result += "2";
			} else if (!isHomerFat && !isBartPrankster) {
				result += "3";
			} else
				result +="4";
			
			
			System.out.println(result + isHomerFat + isBartPrankster);
		}

}
