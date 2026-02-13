package basics;

public class VarArgsDemo {

	public static int add(String name, int... values) {
		int total = 0;

		for (int n : values)
			total += n;

		return total;
	}

	public static void main(String[] args) {
		System.out.println(add("Joe", 10, 20));
		System.out.println(add("Mark", 100, 200, 300, 400));
	}

}
