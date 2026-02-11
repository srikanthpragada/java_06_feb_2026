// Accept marks and display the result assuming pass mark is 50

package assignments;
import java.util.Scanner;

public class ShowResult {
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in); 
		 System.out.print("Enter marks: ");
		 int marks = s.nextInt();     // read int from keyboard 
		 
		 if(marks >= 50)
			 System.out.println("Passed!");
		 else
			 System.out.println("Failed!");
	}
}
