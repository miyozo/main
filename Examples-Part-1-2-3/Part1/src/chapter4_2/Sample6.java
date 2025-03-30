package chapter4_2;
import chapter3_3.Measurement;
public class Sample6 {

	public static void main(String[] args) {

		Measurement data = foo();
		System.out.println(data);
		
	}
	
	public static Measurement foo() {
		var mdata = new Measurement("田中宏",63.5, 178.5);
		return mdata;
	}
}
