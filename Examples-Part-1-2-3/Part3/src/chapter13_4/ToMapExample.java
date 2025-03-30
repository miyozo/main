package chapter13_4;
import java.util.stream.Collectors;
import jp.kwebs.lib.Book;
public class ToMapExample {

	public static void main(String[] args) {
		
		var books = Book.getList();
		var bookMap = books.stream()
						   .collect(Collectors.toMap(Book::getTitle, Book::getPrice));
		bookMap.put("データ分析", 2000);
		System.out.println(bookMap.get("データ分析"));
		
	}

}
