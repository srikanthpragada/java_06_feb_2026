// Take numbers until 0 and display average of all numbers  

package assignments;

import java.util.Scanner;

public class AverageNumbers {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int total = 0, count = 0;
		while (true) {
			System.out.print("Enter a number [0 to stop]: ");
			int num = s.nextInt();

			if (num == 0)
				break; // terminate loop

			total += num;
			count ++;
		}
		
		System.out.println("Average = " + total / count);
	} // main
}
