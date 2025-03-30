package chapter17_3;
import java.time.Duration;
import java.time.LocalDateTime;
public class DurationExample {

	public static void main(String[] args) {
		
		var dateTime1 = LocalDateTime.of(2030, 3, 15, 9, 00, 00);
		var dateTime2 = LocalDateTime.of(2033, 5, 10, 15, 30, 45);
		
		var d = Duration.between(dateTime1, dateTime2);
		System.out.printf("経過時間=%d日/%d時間/%d分/%d秒%n",
			d.toDaysPart(), d.toHoursPart(), d.toMinutesPart(), d.toSecondsPart());
		
		System.out.printf("秒数=%,d秒",d.toSeconds());
	}

}
