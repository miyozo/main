package chapter12_2;
import java.util.ArrayList;
public class Sample1A {
	public static void main(String[] args) {

		var list = new ArrayList<String>();
		list.add("Peach");
		list.add("Apple");
		list.add("Orange");
		
		list.forEach(System.out::println);
		
	}

}
