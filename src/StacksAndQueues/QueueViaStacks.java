package StacksAndQueues;

public class QueueViaStacks {
   
   public static void main( String[] args ) {
      
      MyQueue myQueue = new MyQueue();
      myQueue.push(1);
      myQueue.push(2);
      myQueue.push(3);
      
      System.out.println("Peek - > " + myQueue.peek());
      System.out.println("Pop - > " + myQueue.pop());
      System.out.println("Peek - > " + myQueue.peek());
      System.out.println("Pop - > " + myQueue.pop());
      System.out.println("isEmpty - > " + myQueue.empty());
   }
}
/**
 *
 * OUTPUT:
 *
 * Push : 1 , 2, 3
 *
 * Peek - > 1
 * Pop - > 1
 * Peek - > 2
 * Pop - > 2
 * isEmpty - > false
 *
 */
