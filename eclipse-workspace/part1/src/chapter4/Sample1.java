package chapter4;

import jp.kwebs.lib.Input;

public class Sample1 {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = Input.getString();
		System.out.println(s1.equals(s2));
	}

}
