package chapter17_3;
import java.time.LocalDate;
public class DateTimeComparisonB {
	public static void main(String[] args) {
		
		var date1 = LocalDate.of(2028, 1, 30);
		var date2 = LocalDate.of(2029, 1, 30);
		
		System.out.println(date1.isLeapYear());
		System.out.println(date2.isLeapYear());
	}
}
