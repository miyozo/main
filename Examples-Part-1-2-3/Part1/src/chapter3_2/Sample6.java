package chapter3_2;
import java.util.ArrayList;
public class Sample6 {
	public static void main(String[] args) {
		
		var numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		
		numbers.remove(1);
		System.out.println(numbers);
	}
}
