package ArraysAndStrings;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Given a string, write a function to check if it is a permutation of a palindrome.
 * A palindrome is a word or phrase that is the same forwards and backwards. A permutation
 * is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.
 * EXAMPLE
 * Input: Tact Coa
 * Output: True (permutations: "taco cat". "atco cta". etc.)
 *
 */
public class PalindromePermutation {
   
   
   public static void main( String[] args ) {
   
      List<String> testStrings = testStrings();
      for ( String testString : testStrings ) {
         boolean value = checkPalindromePermutation(testString.toLowerCase());
         System.out.println(testString + ".checkPalindromePermutation = " + value);
      }
   }
   
   private static List<String> testStrings() {
      return List.of(
         "Tact Coa",
         "taco cat",
         "atco cta",
         "caat tac",
         "daot tar"
      );
   }
   
   private static boolean checkPalindromePermutation(String inputString) {
   
      Map<Character, Integer> map = new HashMap<>();
      
      for(int i = 0;i < inputString.length(); i++){
         if(inputString.charAt(i) == ' ')
            continue;
         map.put(inputString.charAt(i), map.getOrDefault(inputString.charAt(i), 0) +1);
      }
      
      boolean foundFalse = false;
      for( Entry<Character, Integer> entry: map.entrySet()){
         if(entry.getValue() % 2 != 0 ){
            if(!foundFalse)
               foundFalse = true;
            else
               return false;
         }
      }
      
      return true;
      
   }
}


/**
 * OUTPUT:
 *
 * Tact Coa.checkPalindromePermutation = true
 * taco cat.checkPalindromePermutation = true
 * atco cta.checkPalindromePermutation = true
 * caat tac.checkPalindromePermutation = true
 * daot tar.checkPalindromePermutation = false
 */
