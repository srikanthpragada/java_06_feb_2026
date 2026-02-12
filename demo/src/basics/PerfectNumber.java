package basics;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number :");
		// read an int from keyboard
		int num = s.nextInt();

		int total = 1;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0)
				 total += i;
		}

		if (total == num)
			System.out.println("Perfect Number!");
		else
			System.out.println("Not a perfect number!");
	}
}
