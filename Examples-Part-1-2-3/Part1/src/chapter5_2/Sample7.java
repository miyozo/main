package chapter5_2;
import jp.kwebs.lib.Input;

public class Sample7 {
	public static void main(String[] args) {

		String str = Input.getString();
		if(str.equals("cat")) {
			System.out.println("大当たり");
		}else {
			System.out.println("はずれ");
		}
	}
}
