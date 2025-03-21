package zero;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> al1 = new ArrayList<>(); 
		al1.add("国語");
		al1.add("数学");
		al1.add("英語");
		al1.add("社会");
		al1.add("理科");
		al1.add("物理");
		
		for(String i : al1) {
			System.out.print(i+" ");
		}
	}

}
