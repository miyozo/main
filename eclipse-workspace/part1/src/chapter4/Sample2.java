package chapter4;

import jp.kwebs.lib.Input;

public class Sample2 {

	public static void main(String[] args) {
		int a = Input.getInt();
		String item = a>0 ? "apple" : "peach"; //条件演算子
		System.out.println(item);
	}

}
