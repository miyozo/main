package chapter13_2;
import java.util.List;
public class Sample11 {
	public static void main(String[] args) {
		
		var list = List.of(
				new Department("総務", List.of("田中", "木村")),
				new Department("経理", List.of("佐藤", "山田")),
				new Department("経理", List.of("山本", "藤田", "斎藤"))	);

		list.stream()
			.mapMulti((e, buf) -> e.employees().forEach(buf::accept))
			.forEach(System.out::println);
	}
}
