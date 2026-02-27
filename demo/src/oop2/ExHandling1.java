package oop2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExHandling1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;

		System.out.print("Enter a number :");
		try {
			n = s.nextInt();
			if (99 % n == 0) {
				System.out.printf("%d is a factor of 99\n", n);
			}
		} catch (InputMismatchException ex) {
			System.out.println("Invalid Number!");
		} catch (ArithmeticException ex) {
			System.out.println("Zero is not valid!");
		}

		System.out.println("The End!");
	}
}
