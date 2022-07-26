package LinkedList;

public class Node {
   
   int data;
   Node next = null;
   
   public Node( int data ) {
      this.data = data;
   }
   
   public Node appendToTail(int d){
      Node end = new Node(d);
      Node n = this;
      while(n.next != null){
         n = n.next;
      }
      n.next = end;
      return n;
   }
   
   public static void printLinkedList(Node head) {
      
      while (head != null) {
         System.out.print(head.data + " -> ");
         head = head.next;
      }
      System.out.println("\n");
   }
   
   public Node getNodeAt(int index){
      Node nodeAtIndex = this;
      int count = 0;
      while(count < index){
         nodeAtIndex = nodeAtIndex.next;
         count++;
      }
      
      return nodeAtIndex;
   }
}
