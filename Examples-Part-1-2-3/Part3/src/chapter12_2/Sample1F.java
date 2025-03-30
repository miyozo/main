package chapter12_2;
import java.util.ArrayList;
public class Sample1F {
	public static void main(String[] args) {

		var list = new ArrayList<String>();
		list.add("Peach");
		list.add("Apple");
		list.add("Orange");
		
		list.clear();
		list.forEach(System.out::println);
		System.out.println(list.isEmpty());
		
	}

}
