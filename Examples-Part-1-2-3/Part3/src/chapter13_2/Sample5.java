package chapter13_2;
import java.util.List;
public class Sample5 {
	public static void main(String[] args) {

		var list = List.of(
					new Meibo(113, "Anne Hathaway"),
					new Meibo(102, "Johnny Depp"),
					new Meibo(113, "Shohei Ohtani"));
		
		list.stream()
			.map(Meibo::name)
			.forEach(System.out::println);
	}
}
