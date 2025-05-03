package jp.kwebs.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookstoreController {
	
	@GetMapping("/book")
	public String display() {
		return "bookstore";
	}
}
