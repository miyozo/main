package chapter5_5;
import jp.kwebs.lib.Input;
public class Sample6 {
	
	public static void main(String[] args) {

		String s;
		while( (s=Input.getString()) != null) {
			System.out.println( s.length() );
		}

	}
}
