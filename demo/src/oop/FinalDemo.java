package oop;

public class FinalDemo {
	public static final double PI = 3.14;
	private final int v;
	
	public FinalDemo() {
		this.v = 100;
	}
	
	public void change( ) {
		//this.v = 20;
	}
	
	public static void main(String[] args) {
		 System.out.println(FinalDemo.PI); 
	}
}
