package chapter17_1;
import java.time.LocalDate;
import java.time.chrono.JapaneseDate;

public class JapaneseDateExample {
	public static void main(String[] args) {
		
		var jDate = JapaneseDate.now();
		jDate = JapaneseDate.of(2025, 8, 16);
		jDate = JapaneseDate.from(LocalDate.of(2025, 8, 16));
		
		System.out.println(jDate);
		
	}
}
