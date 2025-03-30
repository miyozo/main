package chapter6_1;
public class Sample2 {
	public static void main(String[] args) {
		
		var book1 = new Book("1011012345", "Java", "田名宏");
		
		String isbn1 = book1.getIsbn();
		System.out.println(isbn1);
	
		var book2 = new Book("8034012345", "JUMP", "佐藤敏");
		
		String isbn2 = book2.getIsbn();
		System.out.println(isbn2);
	}

}
