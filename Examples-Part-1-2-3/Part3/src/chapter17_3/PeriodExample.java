package chapter17_3;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodExample {

	public static void main(String[] args) {
		var date1 = LocalDate.of(2030, 3, 15);
		var date2 = LocalDate.of(2033, 5, 10);
		
		var p = Period.between(date1, date2);
		System.out.printf("期間＝%d年%d月%d日%n",
							 p.getYears(), p.getMonths(), p.getDays());
							 
		long days = ChronoUnit.DAYS.between(date1, date2);
		System.out.println("期間=" + days + "日");
	}

}
