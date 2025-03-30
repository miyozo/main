package chapter3_2;
import java.util.ArrayList;
import java.util.List;
public class Sample5 {
	public static void main(String[] args) {
		
		var data = List.of(10, 20, 30);
		var numbers = new ArrayList<Integer>();
		
		numbers.addAll(data);
		System.out.println(numbers);
	}
}
