package oop;

public class Counter {
   // instance variables 
   private int value;
   
   public Counter() {
	   value = 0;
   }
   
   public Counter(int v) {
	   value = v;
   }
   
   // methods 
   public void increment() {
	   value ++;
   }
   
   // methods 
   public void increment(int step) {
	   value += step;
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
