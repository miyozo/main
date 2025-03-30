package chapter13_3;
import java.util.List;
public class Sample2 {
	public static void main(String[] args) {
		
		var list = List.of("Python", "Java", "Javascript");
		var	op = list.stream()
					.filter(e->e.length()>9)
					.findAny();
		System.out.println(op.orElse("ストリームは空"));
		
	}

}
