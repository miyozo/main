package chapter7_3;
public class Sample1 {

	public static void main(String[] args) {

		var tax = new Tax(125, "田中宏", 300000, 100000);
		Tax mytax = tax;
		mytax.setIncome(350000);
		
		System.out.println(tax);
		System.out.println(mytax);
		
	}
}
