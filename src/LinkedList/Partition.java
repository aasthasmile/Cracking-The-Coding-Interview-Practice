package LinkedList;

/**
 * Partition: Write code to partition a linked list around a value x, such that all nodes less than x come
 * before all nodes greater than or equal to x. lf x is contained within the list, the values of x only need
 * to be after the elements less than x (see below). The partition element x can appear anywhere in the
 * "right partition"; it does not need to appear between the left and right partitions.
 *
 * EXAMPLE
 * Input: 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 [partition = 5)
 * Output: 3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8
 */
public class Partition {
   
   public static void main( String[] args ) {
      
      Node head = null;
      // Creating A Linked List
      for (int i = 10; i < 12; i++) {
         if (head == null)
            head = new Node(3);
      }
      head.appendToTail(5);
      head.appendToTail(8);
      head.appendToTail(5);
      head.appendToTail(10);
      head.appendToTail(2);
      head.appendToTail(1);
   
      System.out.println("Linked List  ");
      Node.printLinkedList(head);
   
      partitionAroundX( head, 5);
   
      partitionAroundX( head, 1); //edge scenario ( less is empty and greater has allElements)
   
      partitionAroundX( head, 2);
   
      partitionAroundX( head, 11); //edge scenario (less is full and greater is empty)
   
   }
   
   private static void partitionAroundX( Node head, int x ) {
   
      Node lessBeginning = null;
      Node less = null;
      Node greater = null;
      Node greaterBeginning = null;
      
      while(head!=null){
         Node nextNode = head.next;
         head.next = null;
         if(head.data < x){
             if(less == null){
                less = head;
                lessBeginning = less;
             }else{
                less.next = head;
                less = less.next;
             }
         }else {
            if(greater == null){
               greater = head;
               greaterBeginning = greater;
            }else{
               greater.next = head;
               greater = greater.next;
            }
         }
         head = nextNode;
      }
      
      if(less!=null) less.next = greaterBeginning;
      else lessBeginning = greaterBeginning;
      
      System.out.println("\nLinked List after partition around " + x);
      Node.printLinkedList(lessBeginning !=null ? lessBeginning : greaterBeginning);
   }
   
}

/**
 * OUTPUT:
 *
 * Linked List
 * 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 ->
 *
 *
 * Linked List after partition around 5
 * 3 -> 2 -> 1 -> 5 -> 8 -> 5 -> 10 ->
 *
 *
 * Linked List after partition around 1
 * 3 -> 2 -> 1 -> 5 -> 8 -> 5 -> 10 ->
 *
 *
 * Linked List after partition around 2
 * 1 -> 3 -> 2 -> 5 -> 8 -> 5 -> 10 ->
 *
 *
 * Linked List after partition around 11
 * 3 -> 2 -> 5 -> 8 -> 5 -> 10 ->
 */
