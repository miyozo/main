package chapter13_1;
import java.util.List;
public class Sample1 {
	public static void main(String[] args) {

		var list = List.of("Banana", "Orange", "Peach", "Apple", "Pineapple");
		list.stream()
			.filter(e -> e.length()<6)
			.map(e -> e.toUpperCase())
			.forEach(System.out::println);
			
	}
}
