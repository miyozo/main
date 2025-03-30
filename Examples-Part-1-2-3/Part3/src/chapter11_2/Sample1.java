package chapter11_2;

import java.util.List;

public class Sample1 {
	public static void main(String[] args) {
		
//		var list = List.of("Banana", "Apple", "Peach");
		
		var list = List.of( new Apple(320, "red"),
							new Apple(280, "green"),
							new Apple(350, "green"));
		
		list.forEach(e->System.out.println(e));
	}

}
