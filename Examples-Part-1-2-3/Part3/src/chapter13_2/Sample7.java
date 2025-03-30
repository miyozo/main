package chapter13_2;
import java.util.List;
public class Sample7 {
	public static void main(String[] args) {
		
		var list = List.of("apple", "peach", "watermelon", "banana");

		list.stream()
			.dropWhile(e->e.charAt(0)!='w')
			.forEach(System.out::println);
	}
}
