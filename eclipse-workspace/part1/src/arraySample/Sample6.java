package arraySample;

public class Sample6 {

	public static void main(String[] args) {
		
		var m = new Measurement("田中博", 63.5, 178.5);
		String name = m.name();
		double weight = m.weight();
		double height = m.height();
		
		System.out.println(name+weight+height);

	}

}
