package chapter12_3;
import java.util.LinkedHashSet;
public class Sample1B {
	public static void main(String[] args) {
		
		var set = new LinkedHashSet<String>();
		set.add("Peach");
		set.add("Apple");
		set.add("Orange");
		set.add("Apple");
		
		set.forEach(System.out::println);
		
	}
}
