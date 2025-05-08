package jp.kwebs.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.kwebs.bookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
