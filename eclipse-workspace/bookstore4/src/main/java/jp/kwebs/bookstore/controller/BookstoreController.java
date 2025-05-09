package jp.kwebs.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;
import jp.kwebs.bookstore.form.BookForm;
import jp.kwebs.bookstore.service.BookService;

@Controller
@RequestMapping("/book")
public class BookstoreController {
	
	private BookService bs;
	public BookstoreController(BookService bs) {
		this.bs= bs;
	}
	
	@GetMapping("/list")
	public String listing(Model model) {
		model.addAttribute("books" ,bs.readAllBooks());
		return "book-list";
	}
	
	@GetMapping("/create")
	public String bookForm(Model model) {
		model.addAttribute(new BookForm());
		return "book-create";
	}
	
	@PostMapping("/create")
	public String create(@Valid BookForm bookForm, BindingResult result) {
		if(result.hasErrors()) {
			return "book-create";
		}
		bs.createBook(bookForm);
		return "redirect:/book/list";
	}
	
	@GetMapping("/{id}/edit")
	public String edit(@PathVariable Long id, Model model) {
		var book = bs.readBookById(id);
		model.addAttribute("bookForm", bs.toForm(book));
		return "book-edit";
	}
	
	@PostMapping("/edit")
	public String update(@Valid BookForm bookForm, BindingResult result) {
		if(result.hasErrors()) {
			return "book-edit";
		}
		bs.updateBook(bookForm);
		return "redirect:/book/list";
	}
	
	@GetMapping("/{id}/delete")
	public String delete(@PathVariable Long id) {
		bs.deleteBook(id);
		return "redirect:/book/list";
	}
}
