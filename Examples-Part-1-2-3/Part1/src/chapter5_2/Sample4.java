package chapter5_2;
import jp.kwebs.lib.Input;
public class Sample4 {

	public static void main(String[] args) {

		double a = Input.getDouble();
		if(a>0) {
			System.out.println(Math.sqrt(a));
		}
	}
}
