package chapter10_1;

import java.util.List;

public class Sample2 {

	public static void main(String[] args) {
		
		var ls = List.of(new Book(), new Bicycle(), new Student());
		
		for(Versionable v : ls) {
			System.out.println(v.version());
		}
		
	}

}
