package chapter17_3;
import java.time.LocalDate;

public class DateTimeComparison {
	public static void main(String[] args) {
		
		var date1 = LocalDate.of(2028, 1, 30);
		var date2 = LocalDate.of(2028, 7, 30);
		
		System.out.println(date1.isAfter(date2));
		System.out.println(date1.isBefore(date2));
	}
}
