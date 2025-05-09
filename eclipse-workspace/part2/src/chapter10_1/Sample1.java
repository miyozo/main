package chapter10_1;

public class Sample1 {

	public static void main(String[] args) {
		
		var book = new Book();
		System.out.println(book instanceof Book);
		System.out.println(book instanceof Versionable);
	}

}
