package oop;

record Point(int x, int y) {
}

public class TestRecord {

	public static void main(String[] args) {
		var p1 = new Point(10, 20);
		var p2 = new Point(10, 20);

		System.out.println(p1); // p1.toString()
		System.out.println(p1.equals(p2));

		System.out.println(p1.x());

	}

}
