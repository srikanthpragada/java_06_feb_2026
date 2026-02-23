package assignments;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long number = Math.round(Math.random() * 25);
		int attempts = 0;

		while (true) {
			System.out.print("Guess Number :");
			int n = s.nextInt();

			if (n == number) {
				System.out.println("Congratulation!");
				break;
			}

			attempts++;
			if (attempts == 3) {
				System.out.println("Sorry! You couldn't guess the number.");
				break;
			}
			
			if(n < number) 
				System.out.println("Too small!");
			else
				System.out.println("Too big!");
		}

	}

}
