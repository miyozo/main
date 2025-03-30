package chapter12_2;
import java.util.ArrayList;
public class Sample1D {
	public static void main(String[] args) {

		var list = new ArrayList<String>();
		list.add("Peach");
		list.add("Apple");
		list.add("Orange");
		
		System.out.println(list.contains("Apple"));
	//	System.out.println(list.contains("Apples"));
		
	}

}
