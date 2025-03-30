package chapter13_3;
import java.util.List;
public class Sample4 {

	public static void main(String[] args) {
		
		var list = List.of("Python", "Java", "Javascript");
		var csv = list.stream()
					  .reduce((a,b)->a + "," + b);
		System.out.println(csv.get());
						
	}

}
