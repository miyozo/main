package arraySample;

import java.util.ArrayList;

public class Sample4 {

	public static void main(String[] args) {
		
		var numbers = new ArrayList<Integer>() ;
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		
		for(int n : numbers) {
			System.out.println(n);
		}

	}

}
