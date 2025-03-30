package chapter5_1;
import jp.kwebs.lib.Input;
public class Sample8 {

	public static void main(String[] args) {

		int a = Input.getInt();
		String item = a>0 ? "apple" : "peach";
		System.out.println(item);
	}
}
