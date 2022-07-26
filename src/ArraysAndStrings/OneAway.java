package ArraysAndStrings;

import java.util.List;
import org.apache.commons.lang3.tuple.Pair;

/**
 * One Away: There are three types of edits that can be performed on strings: insert a character,
 * remove a character, or replace a character. Given two strings, write a function to check if they are
 * one edit (or zero edits) away.
 * EXAMPLE
 * pale, pIe -> true
 * pales. pale -> true
 * pale. bale -> true
 * pale. bake -> false
 */

public class OneAway {
   
   public static void main( String[] args ) {
   
      List<Pair<String,String>> testStrings = testStringsWithExtraCharacter();
      for(int i = 0; i < testStrings.size(); i++) {
         boolean value = oneDistanceAway(testStrings.get(i).getLeft(), testStrings.get(i).getRight());
         System.out.println(testStrings.get(i)+".oneDistanceAway = " + value);
      }
   
      testStrings = testStringsWithReplacedCharacter();
      for(int i = 0; i < testStrings.size(); i++) {
         boolean value = replaceACharacter(testStrings.get(i).getLeft(), testStrings.get(i).getRight());
         System.out.println(testStrings.get(i)+".replaceACharacter = " + value);
      }
   }
   
   private static boolean replaceACharacter( String str1, String str2 ) {
      
      if(str1.length() != str2.length())
         return false;
      
      boolean foundOneDifference = false;
      for(int i = 0 ,j = 0; i < str1.length() &&j< str2.length() ;i++, j++){
         if(str1.charAt(i) != str2.charAt(j) ){
            if(foundOneDifference){
               return false;
            }
            foundOneDifference = true;
         }
      }
      
      return true;
   }
   
   private static boolean oneDistanceAway( String str1, String str2 ) {
      
      if( Math.abs(str1.length() - str2.length()) != 1 )
         return false;
      
      int i = 0; //bigger string
      int j = 0; //smaller string
      String biggerString = str1.length() > str2.length() ? str1 : str2;
      String smallerString = str1.length() < str2.length() ? str1 : str2;
      
      
      boolean foundOneDifference = false;
      while( i< biggerString.length() && j < smallerString.length()){
         if(biggerString.charAt(i) == smallerString.charAt(j) ){
            i++;
            j++;
         }
         else{
            if(foundOneDifference){
               return false;
            }
            foundOneDifference = true;
            i++;
         }
      }
      
      return true;
      
   }
   
   private static List<Pair<String, String>> testStringsWithExtraCharacter() {
      return List.of(Pair.of("Pale","Pales"),
         Pair.of("Pale","Ple"),
         Pair.of("Pale","Paled"),
         Pair.of("Pale","raled")
      );
   }
   
   
   private static List<Pair<String, String>> testStringsWithReplacedCharacter() {
      return List.of(Pair.of("Pale","Bale"),
         Pair.of("pale","bake"),
         Pair.of("pale","rale")
      );
   }
}

/**
 * OUTPUT:
 *
 * (Pale,Pales).oneDistanceAway = true
 * (Pale,Ple).oneDistanceAway = true
 * (Pale,Paled).oneDistanceAway = true
 * (Pale,raled).oneDistanceAway = false
 * (Pale,Bale).replaceACharacter = true
 * (pale,bake).replaceACharacter = false
 * (pale,rale).replaceACharacter = true
 */
