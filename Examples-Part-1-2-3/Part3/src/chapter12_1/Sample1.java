package chapter12_1;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Sample1 {
	public static void main(String[] args) {

		var list = List.of("Peach", "Apple", "Orange");
		var set = Set.of("Peach", "Apple", "Orange");
		var map = Map.of(1, "Peach", 2, "Apple", 3, "Orange");
	}
}
