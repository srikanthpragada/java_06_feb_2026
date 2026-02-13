// Take marks until -1 is given and display total marks 

package basics;

import java.util.Scanner;

public class TotalMarks2 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int totalMarks = 0;

		while (true) {
			System.out.print("Enter marks [-1 to stop]: ");
			int marks = s.nextInt();

			if (marks == -1)
				break; // terminate loop

			totalMarks += marks;
		}
		System.out.println("Total = " + totalMarks);
	} // main
}
