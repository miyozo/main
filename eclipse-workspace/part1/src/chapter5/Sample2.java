package chapter5;

import jp.kwebs.lib.Input;

public class Sample2 {
	public static void main(String[] args) {
		
		String s = "";
		while(true) {
			s = Input.getString();
			if(s == null) {
				break;
			}
			System.out.println(s.length());
		}
	}

}
