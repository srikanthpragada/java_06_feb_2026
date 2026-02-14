package assignments;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		int a[] = new int[5];

		Scanner s = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.print("Enter a number :");
			a[i] = s.nextInt();
		}

		for(int i = 4; i >= 0; i --)
			System.out.printf("%d ", a[i]);
	}

}
