package chapter7_3;
public class Sample2 {

	public static void main(String[] args) {
		
		var tax = new Tax(125, "田中宏", 300000, 100000);
		sub(tax);
		System.out.println(tax);
	}

	public static void sub(Tax t) {
		t.setIncome(350000);
	}
}
