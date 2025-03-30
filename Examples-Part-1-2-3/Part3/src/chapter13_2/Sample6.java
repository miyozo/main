package chapter13_2;
import java.util.List;
public class Sample6 {
	public static void main(String[] args) {
		
		var list = List.of("apple", "peach", "grape", 
						    		"watermelon", "banana", "cherry");

		list.stream()
			.skip(3)
			.limit(2)
			.forEach(System.out::println);
	}
}
