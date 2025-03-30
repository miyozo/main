package chapter17_3;
import java.time.LocalTime;
public class Calculation2 {
	public static void main(String[] args) {

		var time = LocalTime.of(12, 45, 50);
		var time2 = time.minusHours(6).minusMinutes(30);
		
		System.out.println(time);
		System.out.println(time2);
	}
}
