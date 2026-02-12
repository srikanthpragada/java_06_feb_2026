package basics;

import java.util.Scanner;

public class TotalMarks {

	public static void main(String[] args) {
		 
		Scanner s = new Scanner (System.in);
		int totalMarks = 0;
		for(int i = 1; i <= 5; i ++) {
			System.out.print("Enter marks [-1 to stop]: ");
			int marks = s.nextInt();
			
			if(marks == -1)
				break;
			
			totalMarks += marks;
		}
		
		System.out.println("Total = " + totalMarks);
	} // main
}
