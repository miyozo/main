package chapter6;

import java.util.List;

public class Sample2 {

	public static void main(String[] args) {
		
		var book = new Book();
		
		var book1 = new Book("1011012345", "Java", "田中宏");
		
		String isbn1 = book1.getIsbn();
		System.out.println(isbn1);
		
		var book2 = new Book("8034012345", "JUMP", "佐藤敏");
		
		String isbn2 = book2.getIsbn();
		System.out.println(isbn2);

	}

}
