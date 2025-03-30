package chapter5_2;
import jp.kwebs.lib.Input;
public class Sample6 {

	public static void main(String[] args) {

		double a = Input.getDouble();
		if(a>0) {
			System.out.println(Math.sqrt(a));
		}else {
			System.out.println("値が負なので計算できません");
		}
	}
}
