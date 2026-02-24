package oop;

record Rectangle(int length, int width) {
	// Custom methods 
	public int area() {
		return length * width; 
	}
}

public class TestRecordRect {

	public static void main(String[] args) {
		var r1 = new Rectangle(20, 30);
		var r2 = new Rectangle(20, 30);
		
		System.out.println(r1); // r1.toString()
		System.out.println(r1.equals(r2));

		System.out.println(r1.length()); // getter
		
		System.out.println(r1.area());

	}

}
 
