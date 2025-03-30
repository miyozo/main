package chapter4_2;

public class Sample1 {

	public static void main(String[] args) {

		int[] numbers = {5, 3, 8};
		display(numbers);			// 引数は配列
	}

	public static void display(int[] data) {
		
		for(int n : data) {
			System.out.println(n);
		}	
	}
}
