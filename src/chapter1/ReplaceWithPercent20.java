package chapter1;

public class ReplaceWithPercent20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String demo="This is a pastels shop";
		System.out.println(ReplaceWith20(demo));
	}

	   /* Write a method to replace all spaces in a string with %20*/

	private static String ReplaceWith20(String str) {
		
	    for(int i=0;i<str.length();i++){
	    	if(str.charAt(i)==' '){
	    		str = str.substring(0, i) + "%20" + str.substring(i + 1, str.length());
	   	    	}
	    }
		
		return str;
	}
	
  
}
