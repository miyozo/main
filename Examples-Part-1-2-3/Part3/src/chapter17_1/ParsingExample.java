package chapter17_1;
import java.time.*;

public class ParsingExample {
	public static void main(String[] args) {
		
		var date = LocalDate.parse("2025-08-16");
		var time = LocalTime.parse("13:01:08");
		var dateTime = LocalDateTime.parse("2025-08-16T13:01:08");
		
		System.out.println(date);
		System.out.println(time);
		System.out.println(dateTime);		
	}
}
