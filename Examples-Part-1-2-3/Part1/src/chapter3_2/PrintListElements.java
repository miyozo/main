package chapter3_2;

import java.util.List;

public class PrintListElements {
	public static void main(String[] args) {
		
		var list = List.of(10, 20, 30);
		for(int n : list) {
			System.out.println(n);
		}
	}

}
