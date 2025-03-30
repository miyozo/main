package chapter13_3;
import java.util.List;
public class Sample1A {

	public static void main(String[] args) {
		
		var list = List.of("Python", "Java", "Javascript");
		System.out.println(list.stream().allMatch(e->e.equals("Java")));
		
	}

}
