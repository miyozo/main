package practice;

import jp.kwebs.lib.Input;

public class Sample4 {

	public static void main(String[] args) {
		int a = Input.getInt("a");
		int b = Input.getInt("b");
		int c = Input.getInt("c");
		System.out.println("a,b,cの中の最大値=" + Math.max(c, Math.max(a,b)));
	}
}
