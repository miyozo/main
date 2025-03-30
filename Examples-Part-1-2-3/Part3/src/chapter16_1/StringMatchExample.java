package chapter16_1;
import java.util.List;

public class StringMatchExample {

	public static void main(String[] args) {
		
		var list = List.of("12-4567","456-7890","567-1234","338-18446");
		for(String postalCode : list) {
			boolean result = postalCode.matches("\\d{3}-\\d{4}");
			System.out.printf("%5s: %s%n", result, postalCode);
		}
	}

}
