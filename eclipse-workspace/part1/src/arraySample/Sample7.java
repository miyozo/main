package arraySample;

import java.util.List;

public class Sample7 {

	public static void main(String[] args) {
		
		var list = List.of(
				new Measurement("田中博", 63.5, 178.5),
				new Measurement("佐藤修", 63.5, 178.5),
				new Measurement("鈴木花", 63.5, 178.5));
		
		for(var m : list) {
			String name = m.name();
			double weight = m.weight();
			double height = m.height();
			
			System.out.println(name+weight+height);
			
		}

	}

}
