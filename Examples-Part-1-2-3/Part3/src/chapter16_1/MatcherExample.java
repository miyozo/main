package chapter16_1;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherExample {

	public static void main(String[] args) {

		var list = List.of("12-4567","456-7890","567-1234","3381-1844");
		Pattern p = Pattern.compile("\\d{3}-\\d{4}");
		
		for(String postalCode : list) {
			Matcher m = p.matcher(postalCode);
			boolean result = m.matches();
			System.out.printf("%5s: %s%n", result, postalCode);
		}
	}

}
