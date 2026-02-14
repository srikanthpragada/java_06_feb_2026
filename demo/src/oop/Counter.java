package oop;

public class Counter {
   // instance variables 
   private int value;
   
   // methods 
   public void increment() {
	   value ++;
   }
   
   public void decrement() {
	   if (value > 0)
	        value --;
	   else
		   System.out.println("Decrement beyond 0 is not possible!");
   }
   
   public int getValue() {
	   return value;
   }
}
