package LinkedList;

import java.util.HashSet;
import java.util.Set;

/**
 * Remove Dups: Write code to remove duplicates from an unsorted linked list.
 * FOLLOW UP
 * How would you solve this problem if a temporary buffer is not allowed?
 */
public class RemoveDups {
   
   public static void main( String[] args ) {
   
      Node head = null;
   
      // Creating A Linked List
      for (int i = 10; i < 30; i++) {
         if (head == null)
            head = new Node(i + 2);
         else
            head.appendToTail(i % 2);
      }
      
      //Solution 1  Use extra Space using Set
      try {
         System.out.println("Linked List  ");
         Node.printLinkedList(head);
   
         removeDuplicates(head);
      }finally {
         //do nothing
      }
   
      //Solution 2  In place (without extra buffer)
      try {
         System.out.println("Linked List   ( without buffer )");
         Node.printLinkedList(head);
   
         removeDuplicatesWithoutExtraSpace(head);
      }finally {
         //do nothing
      }
   }
   
   // use 2 pointers similar to 2 for loops nested
   private static void removeDuplicatesWithoutExtraSpace( Node head ) {
      
      Node currentNode = head;
      
      while(currentNode != null){
         
         Node innerNode = currentNode;
         while(innerNode.next != null){
            if(currentNode.data == innerNode.next.data){
               innerNode.next = innerNode.next.next;
            }else{
               innerNode = innerNode.next;
            }
         }
         
         currentNode = currentNode.next;
      }
   
      System.out.println("\nLinked List after modification:");
      Node.printLinkedList(head);
   }
   
   // 1-2 -3 -4 - 3 - 2 ( with using a temporary buffer)
   private static void removeDuplicates( Node head ) {
   
      Node prev = null;
      Node currentNode = head;
      Set<Integer> uniqueNums = new HashSet<>();
      while(currentNode!= null){
         if(uniqueNums.contains(currentNode.data)){
               prev.next = currentNode.next;
               currentNode = currentNode.next;
         }else{
            uniqueNums.add(currentNode.data);
            prev = currentNode;
            currentNode = currentNode.next;
         }
         
      }
   
      System.out.println("\nLinked List after modification:");
      Node.printLinkedList(head);
   }
}

/**
 *
 * OUTPUT:
 *
 * Linked List
 * 12 -> 1 -> 0 -> 1 -> 0 -> 1 -> 0 -> 1 -> 0 -> 1 -> 0 -> 1 -> 0 -> 1 -> 0 -> 1 -> 0 -> 1 -> 0 -> 1 ->
 *
 *
 * Linked List after modification:
 * 12 -> 1 -> 0 ->
 *
 * Linked List   ( without buffer )
 * 12 -> 1 -> 0 ->
 *
 *
 * Linked List after modification:
 * 12 -> 1 -> 0 ->
 *
 */
