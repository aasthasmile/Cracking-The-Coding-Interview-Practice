package StacksAndQueues;

import java.util.ArrayList;
import java.util.List;

/**
 * Three in One: Describe how you could use a single array to implement three stacks.
 *
 */
public class ThreeInOne {
   
   public static void main( String[] args ) {
   
      int initCapacity = 5;
      
      List<Stack> stackList = new ArrayList<>(initCapacity);
      
      for(int i = 0; i < initCapacity ; i++) {
         Stack stack  = new Stack();
         stackList.add(stack);
         
         for(int j = 10; j < 40; j++){
            stack.push(j*(i+1));
         }
   
         System.out.println("Peek is " + stack.peek());
      }
      
      //Test Case
     
     Stack stack1 = stackList.get(0);
     Stack stack2 = stackList.get(1);
     Stack stack3 = stackList.get(2);
   
     stack1.push(12);
     stack1.push(8);
     stack1.printStack();
     
     stack1.pop();
     stack1.pop();
     stack1.printStack();
     
     System.out.println("Peek is " + stack1.peek());
     
     stack2.push(9);
     stack2.push(5);
   
   
     stack2.pop();
     stack2.push(56);
     stack2.printStack();
   
     System.out.println("Peek is " + stack2.peek());
     
     stack3.push(10);
     stack3.pop();
     stack3.push(2);
     stack3.pop();
     stack3.printStack();
     
   }
}
