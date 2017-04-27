package chapter1;

public class StringUniqueCharacters {

	static boolean flag =false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String demo = "pastel";
		System.out.println("Unique Characters: "+stringUniqueChars(demo));
	}

	/*
	 * Implement an algorithm to determine if a string has all unique
	 * characters. What if you can not use additional data structures
	 */
	public static boolean stringUniqueChars(String str) {
		for(int i=0;i<str.length();i++){
			int index=str.indexOf(str.charAt(i));
			int lastindex=str.lastIndexOf(str.charAt(i));
			
			//System.out.println(index +" "+lastindex);
			
			//if first and last occurrence are same,then Stop.
			if(index== lastindex)
				StringUniqueCharacters.flag=true;
			else
				StringUniqueCharacters.flag=false;
		}
		return StringUniqueCharacters.flag;
		
	}
		

}
