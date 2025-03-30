package chapter5_7;

import jp.kwebs.lib.Input;

public class Sample3 {

	public static void main(String[] args) {
		int number = Input.getInt();
		
		switch(number) {
			case	10:
			case	20:		System.out.println("10か20です");
							break;
			case	30:		System.out.println("30です");
							break;
			default:		System.out.println("その他です");
		}
	}

}
