package chapter5;

import java.util.List;

public class Sample3 {

	public static void main(String[] args) {
		
		var numbers = List.of(21,16,-6,18,32);
		for(int n : numbers) {
			if(n < 0) {
				continue;
			}
			System.out.println(n);
		}

	}

}
