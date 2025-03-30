package chapter4_2;
import java.util.List;
public class Sample2 {

	public static void main(String[] args) {

		var numbers = List.of(5, 3, 8);
		display(numbers);		// 引数はリスト
	}

	public static void display(List<Integer> data) {
		
		for(int n : data) {
			System.out.println(n);
		}
	}
}
