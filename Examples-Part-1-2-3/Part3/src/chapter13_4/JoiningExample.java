package chapter13_4;
import java.util.stream.Collectors;
import jp.kwebs.lib.Book;
public class JoiningExample {

	public static void main(String[] args) {
		
		var list = Book.getList();
		String allGenres = list.stream()
			.map(Book::getGenre)
			.distinct()
			.sorted()
			.collect(Collectors.joining(","));
			
		System.out.println(allGenres);
	}

}
