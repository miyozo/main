package chapter6;

public class Sample7 {

	public static void main(String[] args) {
		
		var tax1 = new Tax(121, "田中宏", 300000, 100000);
		int zei = tax1.calculateTax();
		System.out.println("税額=" + zei);
	}

}
