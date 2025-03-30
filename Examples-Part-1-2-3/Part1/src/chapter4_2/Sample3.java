package chapter4_2;
import chapter3_3.Measurement;	
public class Sample3 {

	public static void main(String[] args) {

		var mdata = new Measurement("田中宏",63.5, 178.5); 
		display(mdata);	// 引数はMeasurementレコード
	}

	public static void display(Measurement data) {
		
		System.out.println(data);
		
				
	}
}
