package chapter3_3;

import java.util.List;

public class Sample6 {
	public static void main(String[] args) {

		var list = List.of(
				new Measurement("田中宏", 63.5, 178.5),
				new Measurement("佐藤修", 70.3, 172.2),
				new Measurement("鈴木花", 50.2, 164.8));
		
		for(var m : list) {
			String name = m.name();
			double weight = m.weight();
			double height = m.height();
			
			System.out.println(name + " " + weight + " " + height);
		}
	}
}







