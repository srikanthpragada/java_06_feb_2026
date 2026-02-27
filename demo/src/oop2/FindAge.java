package oop2;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class FindAge {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.print("Enter DOB [yyyy-mm-dd] :");
			String dobstr = s.nextLine();
			try {
				LocalDate dob = LocalDate.parse(dobstr);
				LocalDate cd = LocalDate.now();
				var years = ChronoUnit.YEARS.between(dob, cd);
				System.out.println(years);
				break;
			} catch (DateTimeParseException ex) {
				System.out.println("Invalid Date Format! Please enter in yyyy-mm-dd format");
			}
		}

	}

}
