package LinkedList;

import java.util.Stack;

/**
 * Palindrome: Implement a function to check if a linked list is a palindrome.
 */
public class Palindrome {
   
   public static void main( String[] args ) {
   
   
      Node head = null;
      // Creating A Linked List
      for (int i = 10; i < 15; i++) {
         if (head == null)
            head = new Node(i + 2);
         else
            head.appendToTail(i * 2);
      }
   
      System.out.print("Linked List    ");
      Node.printLinkedList(head);
      boolean check = checkIfPalindrome(head);
      System.out.println(check);
      
      
      //Test Case - 2
      Node list = new Node(2);
      list.appendToTail(3);
      list.appendToTail(4);
      list.appendToTail(3);
      list.appendToTail(2);
   
      System.out.print("Linked List    ");
      Node.printLinkedList(list);
      check = checkIfPalindrome(list);
      System.out.println(check);
   }
   
   // we are goinng to solve using 2 pointer approach
   //fast pointer will move 2x speed and will reach at end of the array
   //whereas slow pointer will move one step ahead and will reach middle of the array
   private static boolean checkIfPalindrome( Node head ){
      
      Node fastPointer = head;
      Node slowPointer = head;
   
      Stack<Integer> stack = new Stack<>();
      
      int count = 1;
      
      while(slowPointer!=null && fastPointer.next!=null){
         
         stack.push(slowPointer.data);
         slowPointer = slowPointer.next;
         
         //move 2x speed
         if(fastPointer.next.next != null) {
            fastPointer = fastPointer.next.next;
            count = count + 2;
         } else if(fastPointer.next!=null){
            fastPointer = fastPointer.next;
            count = count + 1;
         } //1 - 2- 3- 4- 5- 6- 7
        
      }
      
      //odd elements - skip the common middle element
      if(count % 2 != 0){
        slowPointer = slowPointer.next;
      }
      
      boolean foundDiff = false;
      
      //pop elements and check if they are equal , if they are not then it is not palindrome
      while(!stack.isEmpty() && slowPointer!=null){
         int val = stack.pop();
         if(val == slowPointer.data){
            slowPointer = slowPointer.next;
         }else{
            foundDiff = true;
            break;
         }
      }
      
      return stack.isEmpty() && !foundDiff;
      
   }
}

/**
 * OUTPUT:
 * 
 * Linked List  12 -> 22 -> 24 -> 26 -> 28 -> 
 *
 * false
 * 
 * 
 * Linked List  2 -> 3 -> 4 -> 3 -> 2 -> 
 *
 * true
 *
 */
