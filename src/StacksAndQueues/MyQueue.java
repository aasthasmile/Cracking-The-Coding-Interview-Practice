package StacksAndQueues;

import java.util.Stack;

public class MyQueue {
   
   private Stack<Integer> enqueStack;
   private Stack<Integer> dequeStack = null;
   private int size;
   
   public MyQueue() {
      enqueStack = new Stack<>();
      dequeStack = new Stack<>();
      size = 0;
   }
   
   public void push(int x) {
      if(enqueStack.isEmpty() && dequeStack.isEmpty()){
         enqueStack.push(x);
      }else {
         while(!dequeStack.isEmpty()){
            enqueStack.push(dequeStack.pop());
         }
         enqueStack.push(x);
      }
      size++;
   }
   
   public int pop() {
      size--;
      if(enqueStack.isEmpty() && !dequeStack.isEmpty()){
         return dequeStack.pop();
      }else{
         while(!enqueStack.isEmpty()){
            dequeStack.push(enqueStack.pop());
         }
         return dequeStack.pop();
      }
      
   }
   
   public int peek() {
      if(enqueStack.isEmpty() && !dequeStack.isEmpty()){
         return dequeStack.peek();
      }else{
         while(!enqueStack.isEmpty()){
            dequeStack.push(enqueStack.pop());
         }
         return dequeStack.peek();
      }
   }
   
   public boolean empty() {
      return size == 0;
   }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
