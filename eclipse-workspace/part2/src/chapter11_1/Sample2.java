package chapter11_1;

import java.util.List;

public class Sample2 {

	public static void main(String[] args) {
		testApple(a->a.color().equals("green"));
	}
	
	public static void testApple(Predicate p) {
		var list = getAppleList();
		for(Apple a : list) {
			if(p.test(a)) {
				System.out.println(a);
			}
		}
	}
	
	public static List<Apple> getAppleList(){
		var list = List.of(
				new Apple(320, "red"),
				new Apple(280, "green"),
				new Apple(350, "green"),
				new Apple(330, "red"),
				new Apple(250, "red")
				);
		return list;
	}
}
