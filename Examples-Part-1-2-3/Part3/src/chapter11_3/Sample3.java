package chapter11_3;
import java.util.function.*;
public class Sample3 {
	public static void main(String[] args) {

		final String finalStr = "apple banana cherry";

		Predicate<String> p = finalStr::contains;
		System.out.println(p.test("apple"));
	}
}
