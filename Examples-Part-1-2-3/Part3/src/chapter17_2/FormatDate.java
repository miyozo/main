package chapter17_2;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class FormatDate {
	public static void main(String[] args) {
		
		var date = LocalDate.of(2030, 1, 13);
		
		var f1 = DateTimeFormatter.ofPattern("y/M/d");
		var f2 = DateTimeFormatter.ofPattern("M/d");
		var f3 = DateTimeFormatter.ofPattern("MM/dd");
		var f4 = DateTimeFormatter.ofPattern("y年M月d日");
		var f5 = DateTimeFormatter.ofPattern("y年M月d日 eeee");
		var f6 = DateTimeFormatter.ofPattern("y年M月d日 eee");
		
		List.of(f1,f2,f3,f4,f5,f6)
			.forEach(f->System.out.println(date.format(f)));
	}

}
