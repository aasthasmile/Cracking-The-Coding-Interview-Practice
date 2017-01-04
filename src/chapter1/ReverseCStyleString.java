package chapter1;

public class ReverseCStyleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String demo = "this is pastels\0";
		System.out.println(ReverseString(demo));
	}

	/*Write code to reverse a C-Style String.It has a null character at end. */
	
	private static String ReverseString(String str) {
	    StringBuffer reverseString=new StringBuffer();
	    reverseString.append(str);
	    return reverseString.reverse()+"";
		
	}
	
	

}
