package collections;

import java.util.HashSet;

class Circle {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return this.radius;
	}
	
	@Override 
	public boolean equals(Object obj) {
		var other = (Circle) obj;
		return this.radius  == other.radius;
	}

	public int hashCode() {
		return 1;
	}
}

public class TestCircle {

	public static void main(String[] args) {
		var circles = new HashSet<Circle>();

		circles.add(new Circle(10.50));
		circles.add(new Circle(15.10));
		circles.add(new Circle(14.25));
		circles.add(new Circle(10.50));
		
		for(var c : circles) {
			System.out.println(c.getRadius());
			System.out.println(c.hashCode());
		}

	}

}
