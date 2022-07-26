package ArraysAndStrings;

import java.util.Arrays;
import java.util.List;

/**
 * URLify: Write a method to replace all spaces in a string with '%20: You may assume that the string
 * has sufficient space at the end to hold the additional characters, and that you are given the "true"
 * length of the string. (Note: If implementing in Java, please use a character array so that you can
 * perform this operation in place.)
 * EXAMPLE
 * Input: "Mr John Smith " 13-> trueLenth
 * Output: "Mr%20John%20Smith"
 *
 */
public class ReplaceAllSpaces {
   
   public static void main( String[] args ) {
      
      String strToReplace = "%20";
      List<String> testString =  testStrings();
      
      for(int i = 0; i < testString.size();i ++) {
         String replacedString = replaceAllSpaces(testString.get(i), strToReplace);
         System.out.println(testString.get(i)+".replaceAllSpaces = " + replacedString);
      }
      
      String replacedString = replaceAllSpacesWithoutSpace(testString.get(0), strToReplace, 13);
      System.out.println(testString.get(0) +".replaceAllSpacesWithoutSpace = " + replacedString);
    
   }
   
   private static String replaceAllSpacesWithoutSpace(String inputStr, String strToReplace, int trueLength){
      
      char[] input = inputStr.toCharArray();
      int k = trueLength - 1; //check the original
      
      for(int j = input.length - 1; j >=0 ;j-- ){
         
         if(j > trueLength - 1) {
            input[j] = input[k];
            k--;
         }else {
            if ( input[k] == ' ' ) {
               input[j] = strToReplace.charAt(2);
               input[j - 1] = strToReplace.charAt(1);
               input[j - 2] = strToReplace.charAt(0);
               j = j - 2; //
               k--;
            } else {
               input[j] = input[k];
               k--;
            }
         }
      }
      
      return Arrays.toString(input);
   }
   
   
   
   private static List<String> testStrings() {
      return List.of(
         "Mr John Smith      ",
         "Miss Aastha Jain",
         "Mr. Gaurav Palande",
         "Mrs. Ying Chen"
      );
   }
   
   private static String replaceAllSpaces( String str , String strToReplace) {
      
      char[] val = str.toCharArray();
      
      StringBuilder sb = new StringBuilder();
      
      for(int i = val.length - 1 ;i >=0 ;i --){
          if(val[i] == ' '){
             sb.append(strToReplace);
          }else {
             sb.append(val[i]);
          }
      }
      
      return sb.toString();
   }
   
}
