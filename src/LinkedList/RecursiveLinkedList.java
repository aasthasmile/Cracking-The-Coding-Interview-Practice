package LinkedList;

/**
 * Reverse a LinkedList using recursion process
 */
public class RecursiveLinkedList {
    
   public static void main( String[] args ) {
       
       Node head = new Node(2);
       head.appendToTail(3);
       head.appendToTail(4);
       head.appendToTail(5);
   
      printReverseLinkedList(head);
      
      Node node = reverseList(head);
      
      System.out.println("Reverse Linked list : ");
      printReverseLinkedList(node);
   }
   
   public static Node reverseList( Node current )
   {
      if(current == null || current.next == null){
         return current;
      }
      
      Node head = reverseList(current.next);
      current.next.next = current;
      current.next = null;
      return head;
   }
   
   private static void printReverseLinkedList(Node head) {
      while (head != null) {
         System.out.print(head.data + " -> ");
         head = head.next;
      }
      System.out.println("\n");
   }
   
}

/**
 *
 * OUTPUT:
 *
 * > Task :RecursiveLinkedList.main()
 * 2 -> 3 -> 4 -> 5 ->
 *
 * Reverse Linked list :
 * 5 -> 4 -> 3 -> 2 ->
 *
 */
