package oop;

public class TestCounter {

	public static void main(String[] args) {
		var c = new Counter();  // create an object of Counter
		var c2 = new Counter(100);  // create an object of Counter

		System.out.println(c.getValue());  // object.method()

		c.increment();
		c.increment(5);

		System.out.println(c.getValue());
		
		c.decrement();
		c.decrement();
		c.decrement();
		
	}

}
