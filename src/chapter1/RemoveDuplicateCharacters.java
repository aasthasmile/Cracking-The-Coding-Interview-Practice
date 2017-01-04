package chapter1;

import java.util.HashMap;
import java.util.Map.Entry;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
		String demo = "hammburger";
		System.out.println(RemoveDuplicateChar(demo));
	}

	/*
	 * Design an algorithm and write code to remove the duplicate characters in
	 * a string without using any additional buffer.
	 */
	private static String RemoveDuplicateChar(String str) {
		StringBuffer sb = new StringBuffer();
		HashMap<Integer, Character> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			int ascii = str.charAt(i);
		
			if (!map.containsKey(ascii))
				map.put(ascii, (char) (str.charAt(i)));
		}
		
		for(Entry<Integer, Character> entry:map.entrySet()){
			sb.append(entry.getValue());
		}
		
		return sb.toString();
	}

}
