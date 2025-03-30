package chapter11_3;
import java.util.List;
public class Sample4 {
	public static void main(String[] args) {

		var ls = List.of("apple", "banana", "cherry");
		ls.forEach(System.out::println);
	}
}
