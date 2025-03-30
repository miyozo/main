package chapter3_2;

import java.util.List;

public class Sample3 {
	public static void main(String[] args) {
		
		var list = List.of(10, 20, 30);
		int total = 0;
		for(int n : list) {
			total += n;
		}
		System.out.println("合計＝" + total);
		System.out.println("平均＝" + total / list.size());
		System.out.println(list);
	}
}
