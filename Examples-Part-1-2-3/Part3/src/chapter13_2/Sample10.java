package chapter13_2;
import java.util.List;
public class Sample10 {
	public static void main(String[] args) {

		var list = List.of(
				new Department("総務", List.of("田中", "木村", "大谷")),
				new Department("経理", List.of("佐藤", "山田")),
				new Department("営業", List.of("山本", "藤田", "斎藤"))	);

		list.stream()
			.map(e->e.employees())
			.flatMap(e->e.stream())
			.forEach(System.out::println);
	}
}
