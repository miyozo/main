package chapter6_1;
public class Sample3 {
	public static void main(String[] args) {
		
		var book1 = new Book("1011012345", "Java", "田名宏");

		System.out.println(book1.getIsbn());
		System.out.println(book1.getTitle());
		System.out.println(book1.getAuthor());
		
		
	}

}
