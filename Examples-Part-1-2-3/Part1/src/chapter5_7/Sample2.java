package chapter5_7;

import jp.kwebs.lib.Input;

public class Sample2 {

	public static void main(String[] args) {
		int number = Input.getInt();
		
		switch(number) {
			case	10, 20	-> System.out.println("10か20です");
			case	30		-> System.out.println("30です");
			default			-> System.out.println("その他です");
		}
	}
}
