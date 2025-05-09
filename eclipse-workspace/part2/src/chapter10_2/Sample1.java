package chapter10_2;

public class Sample1 {

	public static void main(String[] args) {
		var tax = new Tax(100, "田中宏", 130, 10, new Rate2());
		System.out.println("税額=" + tax.caluclateTax());
	}

}
