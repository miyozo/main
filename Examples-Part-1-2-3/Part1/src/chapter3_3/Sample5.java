package chapter3_3;
public class Sample5 {
	public static void main(String[] args) {

		var m = new Measurement("田中宏", 63.5, 178.5); 
		
		String name = m.name();
		double weight = m.weight();
		double height = m.height();
				
		System.out.println(name + " " + weight + " " + height);
	}
}
