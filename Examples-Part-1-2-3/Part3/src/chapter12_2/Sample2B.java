package chapter12_2;
import java.util.ArrayList;
import java.util.Comparator;
public class Sample2B {
	public static void main(String[] args) {

		var list = new ArrayList<String>();
		list.add("Peach");
		list.add("Apple");
		list.add("Orange");	
		
		list.sort(Comparator.reverseOrder());
		list.forEach(System.out::println);
		
		
	}

}
