package com.tyler.yoga.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tyler.yoga.services.CourseService;
import com.tyler.yoga.services.UserService;
@Controller
public class MainController {

	private final UserService userServ;
	private final CourseService courseServ;
	public MainController(UserService userServ, CourseService courseServ) {
		this.userServ = userServ;
		this.courseServ = courseServ;
	}
	
	@GetMapping("/")
	public String dashboard(HttpSession session, Model model) {
		if(session.getAttribute("user_id") == null) {
			return "redirect:/users/login/register";
		} else {
			model.addAttribute("loggedInUser", userServ.getUser((Long) session.getAttribute("user_id")));
			model.addAttribute("courses", courseServ.getAll());
			return "main/Dashboard.jsp";			
		}
		
	}
}
