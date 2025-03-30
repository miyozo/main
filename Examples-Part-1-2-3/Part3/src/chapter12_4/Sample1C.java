package chapter12_4;
import java.util.TreeMap;
public class Sample1C {
	public static void main(String[] args) {
		
		var map = new TreeMap<Integer, String>();
		map.put(113, "Anne Hathaway");
		map.put(102, "Johnny Depp");
		map.put(115, "Shohei Ohtani");
			
		map.forEach((k,v)->System.out.println(k + ", " + v));
		
	}
}
