package chapter1;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		String word1 = "hammburger";
		String word2 = "bumhmarerg";
	//		String word1 = "spar";
   //		String word2 = "rasp";
		
		
		System.out.println("\'"+word1 + "\' and \'" + word2 + "\' are Anagrams : " + TwoStringsAnagrams(word1, word2));
	}

	/* Write a method to decide if two strings are anagrams or not. */

	private static boolean TwoStringsAnagrams(String word1, String word2) {
		if (word1.length() != word2.length()) {
			return false;
		} else {
			int len = word1.length();
			char[] word1_charArray = word1.toCharArray();
			char[] word2_charArray = word2.toCharArray();

			Arrays.sort(word1_charArray);
			Arrays.sort(word2_charArray);
			
			boolean flag = false;
			
			for (int i = 0; i < len; i++) {
				//System.out.println(word1_charArray[i]+"   "+ word2_charArray[i]);
				if (word1_charArray[i] != word2_charArray[i]) {
					flag = false;
				}
				flag = true;
			}
			if (!flag)
				return false;
			else
				return true;

		}

	}
}

