package StacksAndQueues;

public class Stack {
   
   private static int counter = 0;
   private static final int[] array = new int[1000];
   
   //size of the stack
   private int size;
   
   private int id;
   
   public Stack() {
      this.id = counter++;
   }

   public void push(int element){
     
      array[(counter*size) + id] = element;
      this.size++;
   }
   
   public int pop(){
      if(isEmpty()){
         return -1;
      }
      this.size--;
      return array[(counter* size) + id];
   }
   
   public int peek(){
      if(isEmpty()){
         return -1;
      }
      return array[(counter*(size-1)) + id];
   }
   
   public boolean isEmpty(){
     return size == 0;
   }
   
   public void printStack(){
      System.out.print("Printing Stack [" + id +"] Values -> ");
      for(int i = 0; i< size ; i++){
         System.out.print(array[(counter* i) + id] +" -> ");
      }
      System.out.println();
   }
   
}
