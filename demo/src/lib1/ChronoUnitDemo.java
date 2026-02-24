package lib1;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitDemo {

	public static void main(String[] args) {
		var d1 = LocalDate.of(2024, Month.OCTOBER, 10);
		var d2 = LocalDate.now();

		long months = ChronoUnit.MONTHS.between(d1, d2);
		System.out.println(months);
		
		long days = ChronoUnit.DAYS.between(d1, d2);
		System.out.println(days);
	}

}
