package LinkedList;

import java.util.HashMap;
import java.util.Map;

/**
 * Return Kth to Last: Implement an algorithm to find the kth to last element of a singly linked list.
 */
public class RemoveKthFromLast {
   
   
   public static void main( String[] args ) {
      
      Node head = null;
      
      // Creating A Linked List
      for (int i = 10; i < 20; i++) {
         if (head == null)
            head = new Node(i + 2);
         else
            head.appendToTail(i);
      }
      
      System.out.println("Linked List  ");
      Node.printLinkedList(head);
      removeKthFromLast(head, 3);
      
      System.out.println("Linked List");
      Node.printLinkedList(head);
   
      removeKthFromLastWithoutExtraSpace(head, 5);
   }
   
   //using 2 pointers , where onePointer  = head + k , secondPointer = head then both move by 1 position.
   // When onepointer reaches end , secondPointer is at kth position from last
   private static void removeKthFromLastWithoutExtraSpace( Node head, int k ) {
      
      Node firstPointer = head;
      int count = k -1; //diff btw hea and kth element will be head -k
      while(count !=0){
         firstPointer = firstPointer.next;
         count--;
      }
      
   
      Node prev = null;
      Node secondPointer = head;
      while(firstPointer.next != null){
         firstPointer = firstPointer.next;
         
         prev = secondPointer;
         secondPointer = secondPointer.next;
      }
      
      if(prev!=null)
         prev.next = secondPointer.next;
      else { //prev is NULL, delete first Element in the LinkedList
        head = head.next;
      }
   
      System.out.println("\nLinked List after removing " + k+"th node from the last");
      Node.printLinkedList(head);
      
   }
   
   //12 -> 1 -> 0 -> 1 -> 0 -> 1 -> 0 -> 1 -> 0 -> 1 -> 0
   private static void removeKthFromLast( Node head, int k ) {
      if(head == null)
         return;
   
      Map<Integer, Integer> positionToValueMap = new HashMap<>();
      int lengthOfLinkedList = 0;
      
      Node currentNode  = head;
      while(currentNode != null){
         positionToValueMap.put(lengthOfLinkedList++, currentNode.data );
         currentNode = currentNode.next;
      }
      int value =  positionToValueMap.get(lengthOfLinkedList - k);
     
      //if there are duplicates in the list like (12 -> 1 -> 0 -> 1 -> 0 -> 1 -> 0 -> 1 -> 0 -> 1  )
      // and last kth element is 1 then it will remove all 1's hence we need to keep the count variable to delete only one element
      int count = 0;
      
      Node prev = null;
      currentNode  = head;
      while(currentNode!=null){
         if(currentNode.data == value && count == lengthOfLinkedList - k){
            if(prev!=null) prev.next = currentNode.next;
            else head = head.next; //prev is NULL, delete first Element in the LinkedList
            currentNode = currentNode.next;
         }else{
            prev = currentNode;
            currentNode = currentNode.next;
         }
         count++;
      }
   
      System.out.println("\nLinked List after removing " + k+"th node from the last");
      Node.printLinkedList(head);
   }
}

/**
 *
 * OUTPUT :
 *
 *
 * Linked List
 * 12 -> 11 -> 12 -> 13 -> 14 -> 15 -> 16 -> 17 -> 18 -> 19 ->
 *
 *
 * Linked List after removing 3th node from the last
 * 12 -> 11 -> 12 -> 13 -> 14 -> 15 -> 16 -> 18 -> 19 ->
 *
 * Linked List
 * 12 -> 11 -> 12 -> 13 -> 14 -> 15 -> 16 -> 18 -> 19 ->
 *
 *
 * Linked List after removing 5th node from the last
 * 12 -> 11 -> 12 -> 13 -> 15 -> 16 -> 18 -> 19 ->
 *
 */
