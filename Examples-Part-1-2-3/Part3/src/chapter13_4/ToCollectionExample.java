package chapter13_4;
import java.util.TreeSet;
import java.util.stream.Collectors;
import jp.kwebs.lib.Book;
public class ToCollectionExample {

	public static void main(String[] args) {
		
		var books = Book.getList();
		var genreSet = books.stream()
							 .map(Book::getGenre)
							 .distinct()
							 .collect(Collectors.toCollection(TreeSet::new));
		genreSet.add("IT");
		genreSet.forEach(System.out::println);		 
				 
	}

}
