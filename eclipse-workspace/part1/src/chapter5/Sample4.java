package chapter5;

import jp.kwebs.lib.Dice;
import jp.kwebs.lib.Input;

public class Sample4 {

	public static void main(String[] args) {
		
		String sw;
		do {
			Dice.play();
			sw = Input.getString("続けるならEnter");
		}while(sw == null);
		
		System.out.println("終了");
		
	}

}
