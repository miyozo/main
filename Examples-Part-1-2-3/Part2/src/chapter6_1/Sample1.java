package chapter6_1;

import java.util.List;

public class Sample1 {
	public static void main(String[] args) {

		var book = new Book();
		
		var book1 = new Book("1011012345", "Java", "田名宏");  
		var book2 = new Book("8034012345", "JUMP", "佐藤敏");
		
		var books = List.of(
				new Book("1011012345", "Java", "田名宏"),
				new Book("8034012345", "JUMP", "佐藤敏"),
				new Book("8034012345", "Spring", "木村一郎"));
	}

}
