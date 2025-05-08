package jp.kwebs.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;
import jp.kwebs.bookstore.form.BookForm;

@Controller
@RequestMapping("/book")
public class BookstroreController {
	
	@GetMapping("/create")
	public String bookForm(Model model) {
		var bookForm = new BookForm();
		model.addAttribute("bookForm", bookForm);
		return "book-create";
	}
	
	@PostMapping("/create")
	public String display(@Valid BookForm bookForm, BindingResult result) {
		if(result.hasErrors()) {
			return "book-create";
		}
		return "book-result";
	}

}
