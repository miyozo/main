package chapter13_3;
public class PrimitiveStream3 {
	public static void main(String[] args) {

		var list = Book.getList();
		list.stream()
			.mapToInt(Book::price)
			.forEach(System.out::println);
			
	}

}
