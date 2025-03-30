package chapter13_4;
import java.util.stream.Collectors;
import jp.kwebs.lib.Book;

public class GroupingExample {

	public static void main(String[] args) {
		var books = Book.getList();
		var bookMap = books.stream()
			 .collect(Collectors.groupingBy(Book::getGenre));
		
		var historyList = bookMap.get("HISTORY");
		historyList.forEach(System.out::println);
		
	}

}
