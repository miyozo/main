package chapter4_2;

public class Sample4 {

	public static void main(String[] args) {

		int[] numbers = foo();
		for(int n : numbers) {
			System.out.println(n);
		}
	}
	
	public static int[] foo() {
		int[] numbers = {5, 3, 8};
		return numbers;
	}
}
