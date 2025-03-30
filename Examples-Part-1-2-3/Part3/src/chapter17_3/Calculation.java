package chapter17_3;

import java.time.LocalDate;

public class Calculation {

	public static void main(String[] args) {
		var date = LocalDate.of(2028, 7, 30);
		var date2 = date.plusYears(2).plusMonths(1);
		
		System.out.println(date);
		System.out.println(date2);
	}

}
