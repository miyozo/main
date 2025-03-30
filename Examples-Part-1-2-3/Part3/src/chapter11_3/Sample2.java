package chapter11_3;
import java.util.function.*;
public class Sample2 {
	public static void main(String[] args) {

		Function<String, Integer> f = String::length;
		System.out.println(f.apply("apple"));
	}
}
