package practice;

import jp.kwebs.lib.Input;

public class Sample2 {

	public static void main(String[] args) {
		double a = Input.getDouble("a");
		double b = Input.getDouble("b");
		double c = Input.getDouble("c");
		double d = Math.abs((b * 2) - (4 * a * c));
		System.out.printf("ans = " + "%6.2f%n",Math.sqrt(d));
	}

}
