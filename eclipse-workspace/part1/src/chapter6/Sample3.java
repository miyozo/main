package chapter6;

import java.util.List;

public class Sample3 {

	public static void main(String[] args) {
		
		var book = new Book();
		
		var book1 = new Book("1011012345", "Java", "田中宏");
		
		System.out.println(book1.getIsbn());
		System.out.println(book1.getTitle());
		System.out.println(book1.getAuthor());
		
		var book2 = new Book("8034012345", "JUMP", "佐藤敏");
		
		

	}

}
