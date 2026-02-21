package assignments;

import java.lang.Math;

abstract class Shape {
	protected int x, y;

	public Shape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	final public int getX() {
		return this.x;
	}
	
	final public int getY() {
		return this.y;
	}
	
	public void print() {
		System.out.println(this.x);
		System.out.println(this.y);
	}

	public abstract double getArea();
 	public abstract double getCircumference();
	 
}

class Circle extends Shape {
	protected int radius;

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(this.radius);
	}

	@Override
	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}

	@Override
	public double getCircumference() {
		return 2 * Math.PI * this.radius;
	}
}

class Rectangle extends Shape {
	protected int width, length;

	public Rectangle(int x, int y, int width, int length) {
		super(x, y);
		this.width = width;
		this.length = length;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(this.width);
		System.out.println(this.length);
	}

	public double getArea() {
		return this.length * this.width;
	}

	public double getCircumference() {
		return 2 * (this.length + this.width);
	}
}

public class TestShapes {

	public static void main(String[] args) {
//		var c = new Circle(10, 20, 15);
//		System.out.println(c.getArea());
//
//		var r = new Rectangle(10, 20, 30, 40);
//		System.out.println(r.getArea());
//		System.out.println(r.getCircumference());

		Shape s;

		s = new Circle(10, 10, 20);
		s.print(); // Runtime Polymorphism
		System.out.println(s.getArea());
		System.out.println(s.getCircumference());

		s = new Rectangle(10, 20, 15, 20);
		s.print(); // Runtime Polymorphism
		System.out.println(s.getArea());

	}

}
