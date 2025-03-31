package chapter6;

public class Book {
	private String isbn;
	private String title;
	private String author;
	
	public Book(String isbn, String title, String author) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
	}
	public Book() {}
	
	public String getIsbn() {
		return isbn;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	
	public String toString() {
		return"ISBNコード：" + this.isbn + "\nタイトル：" + this.title + "\n著者：" + this.author;
	}
	
	
}
