package jp.kwebs.bookstore.service;

import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import jp.kwebs.bookstore.entity.Book;
import jp.kwebs.bookstore.form.BookForm;
import jp.kwebs.bookstore.repository.BookRepository;

@Service
public class BookService {

	private BookRepository repo;
	
	public BookService(BookRepository repo) {
		this.repo = repo;
	}
	
	public List<Book> readAllBooks(){
		return repo.findAll();
	}
	
	public Book readBookById(Long id) {
		return repo.findById(id).orElseThrow();
	}
	
	@Transactional
	public void createAllBooks(List<Book> books) {
		repo.saveAll(books);
	}
	
	@Transactional
	public Book createBook(BookForm bookForm) {
		Book book = new Book();
		toEntity(book, bookForm);
		repo.save(book);
		return book;
	}
	
	@Transactional
	public Book updateBook(BookForm bookForm) {
		Book book = readBookById(bookForm.getId());
		toEntity(book, bookForm);
		repo.save(book);
		return book;
	}
	
	@Transactional
	public void deleteBook(Long id) {
		repo.deleteById(id);
	}
	
	public void toEntity(Book book, BookForm bookForm) {
		book.setTitle(bookForm.getTitle());
		book.setDate(bookForm.getDate());
		book.setPrice(bookForm.getPrice());
		book.setMediaType(bookForm.getMediaType());
	}
	
	public BookForm toForm(Book book) {
		return new BookForm(book.getId(),book.getTitle(),book.getDate(),book.getPrice(),book.getMediaType());
	}
}
