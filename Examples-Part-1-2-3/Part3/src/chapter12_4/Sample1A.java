package chapter12_4;
import java.util.HashMap;
public class Sample1A {
	public static void main(String[] args) {
		
		var map = new HashMap<Integer, String>();
		map.put(113, "Anne Hathaway");
		map.put(102, "Johnny Depp");
		map.put(115, "Shohei Ohtani");
//		map.put(115, "Superman");		
		map.forEach((k,v)->System.out.println(k + ", " + v));
		
	}
}
