package chapter11_1;

public class Sample1 {

	public static void main(String[] args) {
		
		var tax = new Tax(100, "田中宏", 130, 10, new Rate());
		System.out.println("税額=" + tax.calculateTax());
	}

}
