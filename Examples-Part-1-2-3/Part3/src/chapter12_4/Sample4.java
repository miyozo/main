package chapter12_4;
import java.util.HashMap;
public class Sample4 {
	public static void main(String[] args) {

		var map = new HashMap<Integer, String>();
		map.put(113, "Anne Hathaway");
		map.put(102, "Johnny Depp");
		map.put(115, "Shohei Ohtani");
		
		System.out.println(map.containsKey(102));
		System.out.println(map.containsValue("Shohei Ohtani"));
	}
}
