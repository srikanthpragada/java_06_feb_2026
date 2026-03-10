package advanced;

import java.util.Arrays;

public class StreamDemo1 {

	public static void main(String[] args) {
		String names[] = {"Java", "c", "Cobol", "Python", "JavaScript", "SQL" };
		
		var avg = 
		  	 Arrays.stream(names)
		     .mapToInt(n -> n.length())   // ToIntFunction -  int applyAsInt(T value)
		     .average();   // OptionalDouble
		
		System.out.println(avg.getAsDouble());
	}

}
