package chapter5_5;
import jp.kwebs.lib.Input;
public class Sample5 {
	
	public static void main(String[] args) {

		String s;

		// 関係式の値
		System.out.println(  (s=Input.getString()) != null  );
		
		System.out.println("s=" + s);
	}
}
