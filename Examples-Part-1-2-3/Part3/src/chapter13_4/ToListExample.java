package chapter13_4;
import java.util.stream.Collectors;
import jp.kwebs.lib.Book;

public class ToListExample {
	public static void main(String[] args) {
		
		var books = Book.getList();
		var genres = books.stream()
			 .map(Book::getGenre)
			 .distinct()
			 .collect(Collectors.toList());
		genres.add("IT");
		genres.forEach(System.out::println);
		
	}

}
