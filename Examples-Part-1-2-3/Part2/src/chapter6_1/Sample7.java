package chapter6_1;
public class Sample7 {

	public static void main(String[] args) {

		var t = new Tax(121, "田中宏", 300000, 100000);
		int zei = t.calculateTax();
		System.out.println("税額=" + zei);
		
	}
}
