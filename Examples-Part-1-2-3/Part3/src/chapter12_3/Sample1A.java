package chapter12_3;
import java.util.HashSet;
public class Sample1A {
	public static void main(String[] args) {
		
		var set = new HashSet<String>();
		set.add("Peach");
		set.add("Apple");
		set.add("Orange");
		set.add("Apple");
		
		set.forEach(System.out::println);
		
	}
}
