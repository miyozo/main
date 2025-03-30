package chapter7_3_2;
public class Sample3 {

	public static void main(String[] args) {

		var id = new Id(100, "田中宏");
		var tax = new Tax(id, 30000, 100000);
		System.out.println(tax);
		
		var field_id = tax.getId();
		field_id.setNumber(200);
		System.out.println(tax);
		
	}
}
