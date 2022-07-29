package StacksAndQueues;

import java.util.Stack;

/**
 * Stack Min: How would you design a stack which, in addition to push and pop, has a function min
 * which returns the minimum element? Push, pop and min should all operate in 0(1) time.
 */
public class StackMin {
   
   public static void main( String[] args ) {
   
   }
   
   private static class MinStack {
   
      private Stack<MyPair> stack;
      private int size;
   
      public MinStack() {
         stack = new Stack<>();
         size = 0;
      }
   
      public void push( int val ) {
         if ( size == 0 ) {
            stack.push(new MyPair(val, val));
         } else {
            if ( stack.isEmpty() ) {
               stack.push(new MyPair(val, val));
            } else {
               MyPair myPair = stack.peek();
               if ( val <= myPair.minValue ) {
                  stack.push(new MyPair(val, val));
               } else {
                  stack.push(new MyPair(val, myPair.minValue));
               }
            }
         }
      
         this.size++;
      }
   
      public void pop() {
         stack.pop();
      }
   
      public int top() {
         MyPair myPair = stack.peek();
         return myPair.stackValue;
      }
   
      public int getMin() {
         MyPair myPair = stack.peek();
         return myPair.minValue;
      }
   
      private class MyPair {
      
         public int stackValue;
         public int minValue;
      
         public MyPair( int stackValue, int minValue ) {
            this.stackValue = stackValue;
            this.minValue = minValue;
         }
      }
   }
   
}
