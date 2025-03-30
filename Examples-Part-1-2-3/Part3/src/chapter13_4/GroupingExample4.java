package chapter13_4;
import java.util.stream.Collectors;
import jp.kwebs.lib.Book;
public class GroupingExample4 {

	public static void main(String[] args) {
		var books = Book.getList();
		var bookMap = books.stream()
				.collect(Collectors.groupingBy(
							Book::getGenre,
							Collectors.collectingAndThen(
								 Collectors.mapping(Book::getTitle, Collectors.toList()),
								 titles -> titles.stream().collect(Collectors.joining(","))
						 )
				));

		bookMap.forEach((k,v)->System.out.println(k + ": " + v));
			   
	}

}
