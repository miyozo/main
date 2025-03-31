package chapter5;

import jp.kwebs.lib.Dice;

public class Sample1 {

	public static void main(String[] args) {
		int n = 0;
		while(n != 6) {
			n = Dice.roll();
		}

	}

}
