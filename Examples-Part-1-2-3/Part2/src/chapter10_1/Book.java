package chapter10_1;

public class Book implements Versionable {
	private int isbn;
	private String title;

	public Book(int isbn, String title) {
		this.isbn = isbn;
		this.title = title;
	}
	public Book() {}
	
	@Override
	public String version() {
		return "Book ver 1.0";
	}
	
}
