package advanced;

import java.util.stream.Stream;

public class SortPositiveNums {

	public static void main(String[] args) {
		
		Stream.of(10, -9, 40, 3, -20, 55, -9, 8)
		 .filter(n  -> n > 0)
		 .sorted()
		 .forEach(System.out::println);
	}

}
