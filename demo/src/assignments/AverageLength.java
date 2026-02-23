package assignments;

import java.util.Scanner;
import java.util.StringJoiner;

public class AverageLength {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		double totalLength = 0, count = 0;

		while (true) {
			System.out.print("Enter name [end to stop] :");
			var name = s.nextLine();

			if (name.toLowerCase().equals("end"))
				break;

			totalLength += name.length();
			count++;
		}

		System.out.printf("Average Length : %f", totalLength / count);

	}

}
