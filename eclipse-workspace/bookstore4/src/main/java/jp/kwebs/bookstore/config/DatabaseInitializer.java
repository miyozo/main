package jp.kwebs.bookstore.config;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import jp.kwebs.bookstore.entity.Book;
import jp.kwebs.bookstore.service.BookService;

@Configuration
public class DatabaseInitializer {

		@Bean
		CommandLineRunner init(BookService bs) {
			CommandLineRunner clr = s->bs.createAllBooks(getBooks());
			return clr;
		}
		
		List<Book> getBooks(){
			var list = List.of(
					new Book(null,"情報倫理",LocalDate.of(2015, 3, 10),3500,List.of("印刷本","電子書籍"))
					);
			return list;
		}
}
