package com.tyler.bookclub.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tyler.bookclub.models.Book;
import com.tyler.bookclub.services.BookService;
import com.tyler.bookclub.services.UserService;

@Controller
@RequestMapping("/books")
public class BookController {

	private final BookService bookServ;
	private final UserService userServ;
	public BookController(BookService bookServ, UserService userServ) {
		this.bookServ = bookServ;
		this.userServ = userServ;
	}
	@GetMapping("/new")
	public String newBook(@ModelAttribute("book") Book book, Model model) {
		return "main/CreateBook.jsp";
	}
	@PostMapping("/process")
	public String createBook(@Valid @ModelAttribute("book") Book book, BindingResult result) {
		if(result.hasErrors()) {
			return "main/CreateBook.jsp";
		} else {
			bookServ.create(book);
			return "redirect:/";
		}
	}
	@GetMapping("/{id}")
	public String showBook(@PathVariable("id") Long id, Model model, HttpSession session) {
		Book book = bookServ.getBook(id);
		model.addAttribute("loggedInUser", userServ.getUser((Long) session.getAttribute("user_id")));
		model.addAttribute("book", book);
		
		return "main/Book.jsp";
	}
	@GetMapping("/edit/{id}")
	public String editBook(@PathVariable("id") Long id, Model model) {
		Book book = bookServ.getBook(id);
		model.addAttribute("book", book);
		return "/main/EditBook.jsp";
	}
	@PutMapping("/edit/process/{id}")
	public String processEditBook(@Valid @ModelAttribute("book") Book book, BindingResult result) {
		if(result.hasErrors()) {
			return "/main/EditBook.jsp";
		}
		bookServ.update(book);
		return "redirect:/";
	}
	@DeleteMapping("/{id}")
	public String processDelete(@PathVariable("id") Long id, Model model) {
		bookServ.deleteById(id);
		return "redirect:/";
	}
}
