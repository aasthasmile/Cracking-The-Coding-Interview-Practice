package LinkedList;

/**
 * Given a circular linked list, implement an algorithm that returns the node at the
 * beginning of the loop.
 * DEFINITION
 * Circular linked list: A (corrupt) linked list in which a node's next pointer points to an earlier node, so
 * as to make a loop in the linked list.
 * EXAMPLE
 * Input: A -> B -> C - > D -> E -> C [the same C as earlier)
 * Output: C
 */
public class LoopDetection {
   
   public static void main( String[] args ) {
   
      Node list1 = new Node(0);
      list1.appendToTail(1);
      list1.appendToTail(2);
      list1.appendToTail(3);
      list1.appendToTail(4);
      list1.appendToTail(5);
      list1.appendToTail(6);
      list1.appendToTail(7);
      list1.appendToTail(8);
      list1.appendToTail(9);
      Node lastNode = list1.appendToTail(10);
   
      System.out.println("\nLinked List:");
      Node.printLinkedList(list1);
      
      Node thirdNode = list1.getNodeAt(8);
      System.out.println("Attach Node " + thirdNode.data + " as the loop node");
      lastNode.next = thirdNode;
   
      Node head = list1;
      int i = 0;
      while (i < 15) {
         System.out.print(head.data + " -> ");
         head = head.next;
         i++;
      }
   
      Node node = checkIfthereIsLoop(list1);
      System.out.println("\nLoop Detected at Node " + node.data);
   }
   
   //two pointer approach : one ptr moves 2x speed and secondpointer moves 1x speed.
   private static Node checkIfthereIsLoop( Node head ) {
      if ( head == null )
         return null;
   
      Node slowPointer = head;
      Node fastPointer = head;
   
      while ( slowPointer != null && fastPointer.next != null ) {
   
         slowPointer = slowPointer.next;
         fastPointer = fastPointer.next.next;
   
         if ( slowPointer == fastPointer ) {
            System.out.println("Loop Detected inside at " + slowPointer.data);
            break;
         }
      }
   
      if ( fastPointer == null || fastPointer.next == null ) {
         return null;
      }
   
      //move the slowPointer at the head of the list
      slowPointer = head;
   
      //now according to the mathematical formula, these are K length apart
      // if we move both by equal steps (slowPtr from head and fastPtr from its currentPosition) then
      // they will reach the intersection point of loop .
      while ( slowPointer != fastPointer ) {
         slowPointer = slowPointer.next;
         fastPointer = fastPointer.next;
      }
   
      return slowPointer;
   }
   
}

/**
 *
 * OUTPUT:
 *
 * Linked List:
 * 0 -> 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> 10 ->
 *
 * Attach Node 8 as the loop node
 * 0 -> 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> 8 -> 9 -> 8 -> 9 -> 8 -> Loop Detected inside at 8
 *
 * Loop Detected at Node 8
 */
