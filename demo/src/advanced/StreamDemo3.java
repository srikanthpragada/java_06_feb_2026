package advanced;

import java.util.Arrays;

public class StreamDemo3 {

	public static void main(String[] args) {
		String names[] = { "Java", "c", "Cobol", "Python", "JavaScript", "SQL" };
		
		Arrays.stream(names)
		     .filter(n -> n.length() > 3)   // Predicate - boolean test(T)
		     .sorted()
		     .forEach(System.out::println);  // Consumer - void accept(T) 
	}

}
