package chapter6;

public class Sample6 {

	public static void main(String[] args) {
		
		var book1 = new Book("1011012345","Java","田中宏");
		var book2 = new Book("8034012345","JUMP","佐藤博");
		
		System.out.println(book1.hashCode());
		System.out.println(book2.hashCode());
	}

}
