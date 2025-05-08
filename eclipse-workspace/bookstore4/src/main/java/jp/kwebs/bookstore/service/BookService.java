package jp.kwebs.bookstore.service;

import org.springframework.stereotype.Service;

import jp.kwebs.bookstore.repository.BookRepository;

@Service
public class BookService {

	private BookRepository repo;
	
	public BookService(BookRepository repo) {
		this.repo = repo;
	}
	
}
