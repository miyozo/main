package chapter15_1;
import java.util.List;
public class SizeExample {
	public static void main(String[] args) {

		var list = List.of(Size.LARGE, Size.MEDIUM, Size.SMALL);
		list.forEach(e->System.out.println(e.max()));
	}

}
