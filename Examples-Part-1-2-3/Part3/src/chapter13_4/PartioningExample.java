package chapter13_4;
import java.util.stream.Collectors;
import jp.kwebs.lib.Book;
public class PartioningExample {

	public static void main(String[] args) {
		var books = Book.getList();
		var bookMap = books.stream()
			 .collect(Collectors.partitioningBy(book->book.getPrice()>2000));
		
		var over2000List = bookMap.get(true);
		over2000List.forEach(System.out::println);
		
	}

}
