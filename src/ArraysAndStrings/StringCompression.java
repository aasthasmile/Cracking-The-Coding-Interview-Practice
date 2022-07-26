package ArraysAndStrings;

import java.util.List;

/**
 * String Compression: Implement a method to perform basic string compression using the counts
 * of repeated characters. For example, the string aabcccccaaa would become a2b1c5a3. If the
 * "compressed" string would not become smaller than the original string, your method should return
 * the original string. You can assume the string has only uppercase and lowercase letters (a - z).
 *
 */

public class StringCompression {
   
   public static void main( String[] args ) {
   
      List<String> testString =  testStrings();
   
      for(int i = 0; i < testString.size();i ++) {
         String compressedString = compressString(testString.get(i));
         System.out.println(testString.get(i) + ".compressString = " + compressedString);
      }
   }

   
   private static String compressString( String inputString ) {
      
      StringBuilder sb = new StringBuilder();
      
      if(inputString.length() == 1){
         return inputString;
      }
   
      int countOccurrences = 1;
      int index = 0;
      for ( index = 0; index< inputString.length() -1; index++ ) {
         if(inputString.charAt(index) == inputString.charAt(index+1)){
            countOccurrences++;
         }else{
            sb.append(countOccurrences == 1 ? inputString.charAt(index): inputString.charAt(index -1));
            sb.append(countOccurrences);
            countOccurrences = 1;
         }
      }
      sb.append(inputString.charAt(index));
      sb.append(countOccurrences);
      
      return sb.toString().length() > inputString.length() ? inputString : sb.toString();
   }
   
   
   
   private static List<String> testStrings() {
      return List.of(
         "aabcccccaaa",
         "aabcccccddd",
         "aaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbccccccccaaaaaaaaaaaaaddddddddddd",
         "abcdefghijklmnopqrstuvwxyz",
         "a"
      );
   }
}

/**
 * OUTPUT:
 *
 * aabcccccaaa.compressString = a2b1c5a3
 * aabcccccddd.compressString = a2b1c5d3
 * aaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbccccccccaaaaaaaaaaaaaddddddddddd.compressString = a17b23c8a13d11
 * abcdefghijklmnopqrstuvwxyz.compressString = abcdefghijklmnopqrstuvwxyz
 * a.compressString = a
 */
