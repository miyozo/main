package chapter13_4;
import java.util.stream.Collectors;
import jp.kwebs.lib.Book;
public class ToSetExample {

	public static void main(String[] args) {
		
		var books = Book.getList();
		var genreSet = books.stream()
							 .map(Book::getGenre)
							 .distinct()
							 .collect(Collectors.toSet());
		genreSet.add("IT");
		genreSet.forEach(System.out::println);		 
				 
	}

}
