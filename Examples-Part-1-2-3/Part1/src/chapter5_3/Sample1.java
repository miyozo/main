package chapter5_3;
import jp.kwebs.lib.Input;
public class Sample1 {
	public static void main(String[] args) {

		int s = Input.getInt();
		switch( s ){
			case		100	-> {	 
				System.out.println("正常終了");
				System.out.println("ステータス番号 : " + s );  
			}
			case		200, 201	->	System.out.println("ページが存在しない");
			default					->	System.out.println("内部エラー");
		}
		
	}
}
