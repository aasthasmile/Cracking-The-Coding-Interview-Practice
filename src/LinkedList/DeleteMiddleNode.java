package LinkedList;

/**
 * Implement an algorithm to delete a node in the middle (i.e., any node but
 * the first and last node, not necessarily the exact middle) of a singly linked list, given only access to
 * that node.
 * EXAMPLE
 * Input: the node c from the linked list a - >b- >c - >d - >e- >f
 * Result: nothing is returned, but the new linked list looks like a - >b- >d - >e- >f
 */
public class DeleteMiddleNode {
   
   public static void main( String[] args ) {
   
      Node head = null;
      // Creating A Linked List
      for (int i = 10; i < 15; i++) {
         if (head == null)
            head = new Node(i + 2);
         else
            head.appendToTail(i * 2);
      }
  
      System.out.println("Linked List  ");
      Node.printLinkedList(head);
      
      removeMiddleNode( head.next.next);
   
      System.out.println("\nLinked List after modification:");
      Node.printLinkedList(head);
   }
   
   private static void removeMiddleNode( Node middleNode ) {
      
      middleNode.data = middleNode.next.data;
      middleNode.next = middleNode.next.next;
   }
   
}

/**
 *
 * OUTPUT:
 *
 * Linked List  
 * 12 -> 22 -> 24 -> 26 -> 28 ->
 *
 *
 * Linked List after modification:
 * 12 -> 22 -> 26 -> 28 ->
 *
 */
