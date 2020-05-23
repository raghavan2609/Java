package works;

import java.time.LocalDate;

public class LocalDateEg {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println("First day: " + today.withDayOfMonth(1));
		System.out.println("Last day: " + today.withDayOfMonth(today.lengthOfMonth()));
		
	}
}
