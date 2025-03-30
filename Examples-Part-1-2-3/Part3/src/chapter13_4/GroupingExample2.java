package chapter13_4;
import java.util.stream.Collectors;
import jp.kwebs.lib.Book;

public class GroupingExample2 {

	public static void main(String[] args) {
		var books = Book.getList();
		var bookMap = books.stream()
			 .collect(Collectors.groupingBy(Book::getGenre));
			
	//	bookMap.forEach((k,v)->System.out.println(k + ": " + v));
		bookMap.forEach((k,v)->{
			var titles = v.stream()
						  .map(Book::getTitle)
						  .toList();
			System.out.println(k + ": " + titles);
		});
			 
	}

}
