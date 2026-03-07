package collections;

public class GenericMethodsDemo {

	public static void print(String[] names) {
		for (var n : names)
			System.out.println(n);
	}

	public static void print(int[] values) {
		for (var n : values)
			System.out.println(n);
	}

	// Generic Method
	public static <T> void show(T [] values) {
		for (var n : values)
			System.out.println(n);
	}

	public static void main(String[] args) {
		String names[] = { "Java", "C#", "C++", "Python" };
		Integer marks[] = { 80, 45, 87, 90, 48 };

//		print(names);
//		print(marks);
		
		show(names);
		show(marks);
	}
}
