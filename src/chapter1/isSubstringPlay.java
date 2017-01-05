package chapter1;

public class isSubstringPlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1 = "waterbottle";
		String word2 = "erbottlewat";
		
		System.out.println("\'"+word1 + "\' and \'" + word2 + "\' are Rotation's : " +isSubstringPlay.isSubstring(word1,word2));
		
	}

	/*Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one 
	 * call to isSubstring (i.e., “waterbottle” is a rotation of “erbottlewat”).*/
	 
	private static boolean isSubstring(String word1, String word2) {
		boolean flag=false;
		if(word1.length()!=word2.length()){
			flag= false;
		}
		else{
		  String repeat =word1+word1 ;   /*waterbottlewaterbottle*/	
		  
		  if(repeat.contains(word2))
			flag= true;
		}
		return flag;
	}

}
/*Solution :
'waterbottle' and 'erbottlewat' are Rotation's : true*/