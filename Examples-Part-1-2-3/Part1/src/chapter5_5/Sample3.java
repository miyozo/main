package chapter5_5;
import jp.kwebs.lib.*;
public class Sample3 {

	public static void main(String[] args) {

		String  s = "";
		while(true) {
			s = Input.getString();
			if(s==null) {
				break;
			}
			System.out.println(s.length());
		}
	}

}
