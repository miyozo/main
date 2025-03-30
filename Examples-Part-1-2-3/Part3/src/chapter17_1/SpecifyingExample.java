package chapter17_1;
import java.time.*;

public class SpecifyingExample {
	public static void main(String[] args) {

		var date = LocalDate.of(2025, 8, 16);
		var time = LocalTime.of(13, 1, 8);
		var dateTime = LocalDateTime.of(2025, 8, 16, 13, 1, 8);
		
		System.out.println(date);
		System.out.println(time);
		System.out.println(dateTime);
	}
}
