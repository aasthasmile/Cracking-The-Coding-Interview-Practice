package StacksAndQueues;

import java.util.Stack;

public class SortStack {
   
   public static void main( String[] args ) {
   
      SortStackUsingTempStack sortStack = new SortStackUsingTempStack();
      sortStack.push(1);
      System.out.println("Peek is " + sortStack.peek());
      sortStack.push(3);
      System.out.println("Peek is " + sortStack.peek());
      sortStack.push(2);
      System.out.println("Peek is " + sortStack.peek());
      sortStack.push(4);
      System.out.println("Peek is " + sortStack.peek());
      sortStack.push(6);
      System.out.println("Peek is " + sortStack.peek());
      sortStack.push(5);
      System.out.println("Peek is " + sortStack.peek());
   
   }
   
   private static class SortStackUsingTempStack
   {
      private Stack<Integer> stack;
      private Stack<Integer> tempStack;
      int size = 0;
   
   
      public SortStackUsingTempStack() {
         stack = new Stack<>();
         tempStack = new Stack<>();
      }
   
      public void push(int x) {
         System.out.println("Push is " + x);
         while ( !stack.isEmpty() ){ //move all elements from stack to tempStack
            tempStack.push(stack.pop());
         }
         
         if(tempStack.isEmpty()){
            tempStack.push(x);
         } else{
            int tempElement = x;
            if(tempElement >= tempStack.peek()){
              
               tempStack.push(x);
            }else {
               while(tempElement < tempStack.peek()){
                  stack.push(tempStack.pop());
               }
               tempStack.push(tempElement);
            }
         }
         while ( !tempStack.isEmpty() ){ //move all elements from temp to mainSyack
            stack.push(tempStack.pop());
         }
         size++;
      }
   
      public int pop() {
         size--;
         return stack.pop();
      }
   
      public int peek() {
         if(size == 0) return -1;
        return stack.peek();
      }
   
      public boolean empty() {
        return size == 0;
      }
   }
   
}

/**
 * Output:
 *
 * Push is 1
 * Peek is 1
 * Push is 3
 * Peek is 1
 * Push is 2
 * Peek is 1
 * Push is 4
 * Peek is 1
 * Push is 6
 * Peek is 1
 * Push is 5
 * Peek is 1
 */
