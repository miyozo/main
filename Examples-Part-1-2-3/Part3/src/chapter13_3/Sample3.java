package chapter13_3;
import java.util.Comparator;
public class Sample3 {

	public static void main(String[] args) {
		
		var list = Book.getList();
		var maxBook = list.stream()
						.max(Comparator.comparing(Book::price));
		System.out.println(maxBook.get());
	}

}
