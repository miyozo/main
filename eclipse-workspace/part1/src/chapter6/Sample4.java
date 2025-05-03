package chapter6;

public class Sample4 {

	public static void main(String[] args) {
		var book1 = new Book("1011012345","Java","田中宏");
		var book2 = new Book("8034012345","JUMP","佐藤博");
		
		book2.setIsbn("1011012345");
		
		System.out.println(book1);
		
		if(book1.equals(book2)) {
			System.out.println("同じ");
		}else {
			System.out.println("同じではない");
		}
	}

}
