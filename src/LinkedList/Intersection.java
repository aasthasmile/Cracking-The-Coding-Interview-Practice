package LinkedList;

/**
 * Given two (singly) linked lists, determine if the two lists intersect. Return the intersecting
 * node. Note that the intersection is defined based on reference, not value. That is, if the kth
 * node of the first linked list is the exact same node (by reference) as the jth node of the second
 * linked list, then they are intersecting.
 */
public class Intersection {
   
   public static void main( String[] args ) {
   
      // Creating A Linked List
      Node list1 = new Node(7);
      list1.appendToTail(6);
      list1.appendToTail(5);
      list1.appendToTail(4);
      Node intersectedNode = list1.appendToTail(3);
      list1.appendToTail(2);
      list1.appendToTail(1);
      list1.appendToTail(0);
      
      Node list2 = new Node(2);
      list2.appendToTail(3);
      list2.appendToTail(4);
      list2.appendToTail(5);
      Node lastNode = list2.appendToTail(6);
      lastNode.next.next = intersectedNode.next;
   
      System.out.println("Linked List (List 1)");
      Node.printLinkedList(list1);
   
      System.out.println("Linked List (List 2)");
      Node.printLinkedList(list2);
      
      Node intersectingNode = findIntersectingNodes(list1, list2);
      System.out.println("Intersecting Node is "+ intersectingNode.data);
   }
   
   //reversing the linked list by using recursion and then finding the common point of intersection
   private static Node findIntersectingNodes( Node list1, Node list2 ) {
      
      Node list1Reversed = RecursiveLinkedList.reverseList(list1);
      Node list2Reversed = RecursiveLinkedList.reverseList(list2);
   
      System.out.println("Linked List (List 1 Reversed)");
      Node.printLinkedList(list1Reversed);
   
      System.out.println("Linked List (List 2 Reversed)");
      Node.printLinkedList(list2Reversed);
      
      Node prev = null;
      
      while( list1Reversed != null || list2Reversed != null){
         
         if(list1Reversed == list2Reversed) {
            prev = list1Reversed;
            list1Reversed = list1Reversed.next;
            list2Reversed = list2Reversed.next;
         }else{
            return prev;
         }
      }
      
      return null;
   }
}

/**
 * OUTPUT:
 *
 *
 * Manav.isUniqueCharacters = false
 * Aastha.isUniqueCharacters = false
 * Gaurav.isUniqueCharacters = false
 * Ying.isUniqueCharacters = true
 * Manav.isUniqueCharactersWithNoSpace = false
 * Aastha.isUniqueCharactersWithNoSpace = false
 * Gaurav.isUniqueCharactersWithNoSpace = false
 * Ying.isUniqueCharactersWithNoSpace = true
 */
