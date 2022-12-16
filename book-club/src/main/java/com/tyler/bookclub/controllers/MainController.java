package com.tyler.bookclub.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tyler.bookclub.services.BookService;
import com.tyler.bookclub.services.UserService;
@Controller
public class MainController {

	private final UserService userServ;
	private final BookService bookServ;
	public MainController(UserService userServ, BookService bookServ) {
		this.userServ = userServ;
		this.bookServ = bookServ;
	}
	
	@GetMapping("/")
	public String dashboard(HttpSession session, Model model) {
		if(session.getAttribute("user_id") == null) {
			return "redirect:/users/login/register";
		} else {
			model.addAttribute("loggedInUser", userServ.getUser((Long) session.getAttribute("user_id")));
			model.addAttribute("books", bookServ.getAll());
			return "main/Dashboard.jsp";			
		}
		
	}
}
