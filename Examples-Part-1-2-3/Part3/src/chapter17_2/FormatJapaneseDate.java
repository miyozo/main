package chapter17_2;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class FormatJapaneseDate {
	public static void main(String[] args) {
		
		var date = JapaneseDate.of(2030, 1, 13);
		var f1 = DateTimeFormatter.ofPattern("y年M月d日 eeee");
		var f2 = DateTimeFormatter.ofPattern("Gy年M月d日 eeee");
		
		List.of(f1,f2)
			.forEach(f->System.out.println(date.format(f)));
	}

}
