package chapter12_3;
import java.util.TreeSet;
public class Sample1C {
	public static void main(String[] args) {
		
		var set = new TreeSet<String>();
		set.add("Peach");
		set.add("Apple");
		set.add("Orange");
		set.add("Apple");
		
		set.forEach(System.out::println);
		
	}
}
