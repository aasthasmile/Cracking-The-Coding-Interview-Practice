package LinkedList;

import org.apache.commons.lang3.tuple.Pair;

public class SumLists {
   
   private static Pair<Node, Node> testNodes(){
      Node list1 = new Node(9);
      list1.appendToTail(9);
      list1.appendToTail(9);
      list1.appendToTail(9);
      list1.appendToTail(9);
      
      Node list2 = new Node(9);
      list2.appendToTail(9);
      list2.appendToTail(9);
      
      return Pair.of(list1, list2);
   }
   
   public static void main( String[] args ) {
   
      Pair<Node, Node> testNode = testNodes();
      System.out.println("List 1: ");
      Node.printLinkedList(testNode.getLeft());
   
      System.out.println("List 2: ");
      Node.printLinkedList(testNode.getRight());
      
      Node list3 = sumDigitsInReverseOrder(testNode.getLeft(), testNode.getRight());
      System.out.println("List 3(Sum Digits in Reverse Order): ");
      Node.printLinkedList(list3);
   
      list3 = sumDigitsInReverseOrderWithRecursion(testNode.getLeft(), testNode.getRight(), 0);
      System.out.println("List 3(Sum Digits in Reverse Order with Recursion): ");
      Node.printLinkedList(list3);
      
      Node list4 = sumDigitsInForwardOrder(testNode.getLeft(), testNode.getRight());
      System.out.println("List 4(Sum Digits in Forward Order): ");
      Node.printLinkedList(list4);
      
   }

   private static Node sumDigitsInForwardOrder( Node list1, Node list2 ) {
      
      
      return null;
   }
   
   
   private static Node sumDigitsInReverseOrder(Node list1, Node list2){
      
      if(list1 == null)
         return list2;
      
      if(list2 == null)
         return list1;
      
      
      Node list3 = null;
      Node head = null;
      int carry = 0;
      
      while(list1!= null || list2 != null){
         
         int sum = 0;
         if(list1 != null){
            sum = list1.data;
         }
         if(list2 != null){
            sum += list2.data;
         }
         
         //put the value in the list1.data
         int result =  sum + carry;
         carry = result > 9 ? 1 : 0;
         
         Node newNode = new Node(result > 9 ? result % 10 :result);
         if(list3==null){
            list3 = newNode;
            head = list3;
         }else {
            list3.next = newNode;
            list3 = list3.next;
         }
   
         if(list1!= null) {
            list1 = list1.next;
         }
         if(list2!= null) {
            list2 = list2.next;
         }
      }
      
      if(carry != 0){
         list3.next = new Node(carry);
      }
      
      return head;
      
   }
   
   
   private static Node sumDigitsInReverseOrderWithRecursion( Node list1, Node list2, int carry ) {
      
      return null;
   }
   
}
