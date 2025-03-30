package chapter17_1;
import java.time.*;

public class CurrentExample {
	public static void main(String[] args) {
		
		var date = LocalDate.now();
		var time = LocalTime.now();
		var dateTime = LocalDateTime.now();
		
		System.out.println(date);
		System.out.println(time);
		System.out.println(dateTime);
	}
}
