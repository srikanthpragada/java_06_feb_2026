package collections;

import java.util.HashSet;

class Square {
	private int side;

	public Square(int side) {
		super();
		this.side = side;
	}

	@Override
	public String toString() {
		return "Side :" + this.side;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Square other)
			return other.side == this.side;
		else
			return false;
	}
	
	public int hashCode() {
		return this.side;
	}
}

public class TestSquare {
	public static void main(String[] args) {
		var squares = new HashSet<Square>();

		squares.add(new Square(10));
		squares.add(new Square(5));
		squares.add(new Square(10));
		squares.add(new Square(15));

		for (var s : squares)
			System.out.println(s);
	}
}
