package ArraysAndStrings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
 * cannot use additional data structures?
 */
public class AllUniqueCharacters {
   
   public static void main( String[] args ) {
   
      List<String> testStrings = testStrings();
      for(int i = 0; i < testStrings.size(); i++) {
         boolean value = isUniqueCharacters(testStrings.get(i));
         System.out.println(testStrings.get(i)+".isUniqueCharacters = " + value);
      }
   
      for(int i = 0; i < testStrings.size(); i++) {
         boolean value = isUniqueCharactersWithNoSpace(testStrings.get(i));
         System.out.println(testStrings.get(i)+".isUniqueCharactersWithNoSpace = " + value);
      }
   }

   
   private static boolean isUniqueCharacters( String stringToCheck ) {
   
      Set<Character> uniqueChars = new HashSet<>();
      for(int i = 0; i<stringToCheck.length();i++){
         if(uniqueChars.contains(stringToCheck.charAt(i))) {
            return false;
         }
         uniqueChars.add(stringToCheck.charAt(i));
      }
      
      return true;
   }
   
   private static boolean isUniqueCharactersWithNoSpace( String stringToCheck ) {
   
      char[] stringChar = stringToCheck.toCharArray();
      Arrays.sort(stringChar);
      
      for(int i = 0 ;i < stringChar.length - 1 ;i++){
         if(stringChar[i] == stringChar[i+1]){
            return false;
         }
      }
      
      return true;
   }
   
   
   private static List<String> testStrings() {
      return List.of(
         "Manav",
         "Aastha",
         "Gaurav",
         "Ying"
      );
   }
}

/**
 * OUTPUT:
 *
 * Manav.isUniqueCharacters = false
 * Aastha.isUniqueCharacters = false
 * Gaurav.isUniqueCharacters = false
 * Ying.isUniqueCharacters = true
 *
 * Manav.isUniqueCharactersWithNoSpace = false
 * Aastha.isUniqueCharactersWithNoSpace = false
 * Gaurav.isUniqueCharactersWithNoSpace = false
 * Ying.isUniqueCharactersWithNoSpace = true
 *
 *
 */
