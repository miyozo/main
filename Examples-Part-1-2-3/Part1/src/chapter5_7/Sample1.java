package chapter5_7;

import jp.kwebs.lib.Dice;
import jp.kwebs.lib.Enter;

public class Sample1 {
	public static void main(String[] args) {
		
		String sw;
		do {
			Dice.play();
			sw = Enter.stringValue("続けるならEnter");
		}while(sw==null);
		
		System.out.println("終了");
	}
}
