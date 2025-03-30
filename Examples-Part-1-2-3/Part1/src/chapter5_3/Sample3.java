package chapter5_3;

import jp.kwebs.lib.Input;

public class Sample3 {

	public static void main(String[] args) {
		
		int s = Input.getInt();
		String msg = switch(s) {
			case 100		-> "正常終了";
			case 200, 201	-> "ページが存在しない";
			default			-> {
				System.out.println("ステータス番号:" + s);
				yield "内部エラー";
			}
		};
		System.out.println(msg);
	}

}
