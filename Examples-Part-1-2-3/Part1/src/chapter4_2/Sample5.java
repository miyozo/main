package chapter4_2;
import java.util.List;
public class Sample5 {

	public static void main(String[] args) {

		List<Integer> numbers = foo();
		for(int n : numbers) {
			System.out.println(n);
		}
	}
	
	public static List<Integer> foo() {
		var numbers = List.of(5, 3, 8);
		return numbers;
	}
}
