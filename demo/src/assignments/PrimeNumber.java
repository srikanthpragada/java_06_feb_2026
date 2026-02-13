package assignments;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number :");
		// read an int from keyboard
		int num = s.nextInt();

		boolean prime = true;
		
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				 prime = false;
				 break;
			}
		}

		if (prime)
			System.out.println("Prime Number!");
		else
			System.out.println("Not a prime number!");
	}
}
