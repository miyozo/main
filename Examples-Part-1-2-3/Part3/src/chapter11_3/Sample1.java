package chapter11_3;
import java.util.function.*;
public class Sample1 {
	public static void main(String[] args) {

		UnaryOperator<Double> u = Math::sqrt;
		System.out.println(u.apply(2.0));
	}
}
