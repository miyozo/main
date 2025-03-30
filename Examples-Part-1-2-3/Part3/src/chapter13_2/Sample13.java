package chapter13_2;
import java.util.List;
public class Sample13 {
	public static void main(String[] args) {

		var list = List.of("apple", "peach", "grape");
		
		var result = list.stream()
			.map(String::toUpperCase)
			.peek(e->System.out.println("mapの後：" + e))
			.toList();
			
		result.forEach(System.out::println);
	}
}
