package chapter13_3;
import java.util.List;

public record Book(String title, String author, int price) {
	 
	public static List<Book> getList() {
		return List.of(
					new Book("坊ちゃん", "夏目漱石", 400),
					new Book("高瀬舟", "森鴎外", 500),
					new Book("三四郎", "夏目漱石", 300),
					new Book("舞姫", "森鴎外", 200),
					new Book("吾輩は猫である", "夏目漱石", 600)	);
	}
}
