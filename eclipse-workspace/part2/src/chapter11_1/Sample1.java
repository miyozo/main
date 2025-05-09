package chapter11_1;

public class Sample1 {

	public static void main(String[] args) {
		
		var tax = new Tax(100, "田中宏", 130, 10, income->income>100?0.3:0.15);
		
		System.out.println("税額=" + tax.caluclateTax());
	}

}
