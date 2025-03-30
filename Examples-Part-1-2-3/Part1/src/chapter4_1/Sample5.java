package chapter4_1;

public class Sample5 {
	public static void main(String[] args) {
		System.out.println(menseki(3, 4));
		System.out.println(menseki(7, 5, 4));
	}
	
	public static double menseki(double h, double w) { 
		return h * w / 2; 
	}

	public static double menseki(double a, double b, double c) { 
		double s = (a + b + c) / 2; 
		double ss = Math.sqrt(s*(s-a)*(s-b)*(s-c)); 
		return ss; 
	} 

}
