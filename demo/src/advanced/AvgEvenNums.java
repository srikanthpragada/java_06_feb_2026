package advanced;

import java.util.Arrays;

public class AvgEvenNums {

	public static void main(String[] args) {
		int nums[] = { 10, -9, 40, 3, -20, 55, -9, 8 };

		
		var avg = 
		 Arrays.stream(nums)
		 .filter(n  ->  n > 0 && n % 2 == 0)
         .average()
         .getAsDouble();
		
		System.out.println(avg);
	}

}
