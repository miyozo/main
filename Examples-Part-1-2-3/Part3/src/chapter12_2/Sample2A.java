package chapter12_2;
import java.util.ArrayList;
import java.util.Comparator;
public class Sample2A {
	public static void main(String[] args) {

		var list = new ArrayList<String>();
		list.add("Peach");
		list.add("Apple");
		list.add("Orange");	
		
		list.sort(Comparator.naturalOrder());
		list.forEach(System.out::println);
		
		
	}

}
