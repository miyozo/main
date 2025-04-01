package chapter1;

import java.util.Date;
import java.util.Objects;

public class Book implements Comparable<Book>{
	private String title;
	private Date publishDate;
	private String comment;
	
	public int hashCode() {
		return Objects.hash(this.title, this.publishDate, this.comment);
	}
	
	public boolean equals(Object o) {
		if(o == this) {
			return true;
		}
		
		if(o == null) {
			return false;
		}
		
		if(!(o instanceof Book)) {
			return false;
		}
		
		Book book = (Book)o;
		
		if(!title.equals(book.title)) {
			return false;
		}
		
		if(!publishDate.equals(book.publishDate)) {
			return false;
		}
		
		return true;
	}
	
	public int compareTo(Book o) {
		return this.publishDate.compareTo(o.publishDate); //自然順序付け
	}
}