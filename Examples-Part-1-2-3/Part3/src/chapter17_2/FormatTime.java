package chapter17_2;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;

public class FormatTime {
	public static void main(String[] args) {
		
		var time  = LocalTime.of(19, 10, 5, 987654321);
		
		var f1 = DateTimeFormatter.ofPattern("H:m:s");
		var f2 = DateTimeFormatter.ofPattern("h:m:s");
		var f3 = DateTimeFormatter.ofPattern("hh:mm:ss");
		var f4 = DateTimeFormatter.ofPattern("hh:mm:ss SSS");
		var f5 = DateTimeFormatter.ofPattern("hh時mm分");
		var f6 = DateTimeFormatter.ofPattern("a hh時mm分");
		var f7 = DateTimeFormatter.ofPattern("hh時mm分 a", Locale.US);
		
		List.of(f1,f2,f3,f4,f5,f6, f7)
			.forEach(f->System.out.println(time.format(f)));
	}

}
