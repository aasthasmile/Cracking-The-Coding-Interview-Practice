package ArraysAndStrings;

import java.util.List;
import org.apache.commons.lang3.tuple.Pair;

/**
 * Check Permutation: Given two strings, write a method to decide if one is a permutation of the
 * other.
 */
public class CheckPermutation {
   
   public static void main( String[] args ) {
      
      
      List<Pair<String,String>> testStrings = testStrings();
      for(int i = 0; i < testStrings.size(); i++) {
         boolean value  = checkPermutationOfTwoString(testStrings.get(i).getKey() ,testStrings.get(i).getValue());
         System.out.println(testStrings.get(i)+".checkPermutationOfTwoString = " + value);
      }
   }
   
   private static boolean checkPermutationOfTwoString(String str1, String str2) {
      
      if(str1.length() != str2.length())
         return false;
      
      int[] charArr = new int[26];
      
      for(int i = 0;i <str1.length();i++){
         int position = str1.charAt(i)-'a';
         charArr[position] = charArr[position] +  1;
      }
   
      for(int i = 0;i <str2.length();i++){
         int position = str2.charAt(i)-'a';
         charArr[position] = charArr[position] - 1;
         if(charArr[position] < 0) {
            return false;
         }
      }
      
      return true;
   }
   
   
   private static List<Pair<String,String>> testStrings() {
      return List.of(Pair.of("manav","naavm"),
         Pair.of("aastha","aaaths"),
         Pair.of("gaurav","varuag"),
         Pair.of("ying","ngit"),
         Pair.of("hemant","taanmh"),
         Pair.of("abcdefgh","hgdebcaa")
      );
   }
   
}

/**
 * OUTPUT:
 *
 * (manav,naavm).checkPermutationOfTwoString = true
 * (aastha,aaaths).checkPermutationOfTwoString = true
 * (gaurav,varuag).checkPermutationOfTwoString = true
 * (ying,ngit).checkPermutationOfTwoString = false
 * (hemant,taanmh).checkPermutationOfTwoString = false
 * (abcdefgh,hgdebcaa).checkPermutationOfTwoString = false
 */
