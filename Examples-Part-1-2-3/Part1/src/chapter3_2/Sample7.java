package chapter3_2;
import java.util.ArrayList;
import java.util.List;
public class Sample7 {
	public static void main(String[] args) {
		
		var numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		
		numbers.clear();
		System.out.println(numbers);
		
	}
}
