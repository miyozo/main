package chapter5_2;
public class Sample9 {

	public static void main(String[] args) {

		double value = Math.random();
		
		if(value>=0.9) {
			System.out.printf("大吉 %.3f%n", value);
		}
		else if(value>=0.7) {
			System.out.printf("中吉 %.3f%n", value);
		}
		else if(value>=0.5) {
			System.out.printf("小吉 %.3f%n", value);
		}
		else {
			System.out.printf("吉 %.3f%n", value);
		}
		
	}
}
