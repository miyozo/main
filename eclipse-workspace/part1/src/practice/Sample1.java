package practice;

import jp.kwebs.lib.Input;

public class Sample1 {

	public static void main(String[] args) {
		double a = Input.getDouble("角度");
		double b = Math.toRadians(a);
		System.out.printf("sin = "+"%6.3f%n",Math.sin(b));
		System.out.printf("cos = "+"%6.3f%n",Math.cos(b));
	}

}
