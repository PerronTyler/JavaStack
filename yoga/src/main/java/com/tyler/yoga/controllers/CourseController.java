package com.tyler.yoga.controllers;

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

import com.tyler.yoga.models.Course;
import com.tyler.yoga.services.CourseService;
import com.tyler.yoga.services.UserService;

@Controller
@RequestMapping("/courses")
public class CourseController {

	private final CourseService courseServ;
	private final UserService userServ;
	public CourseController(CourseService courseServ, UserService userServ) {
		this.courseServ = courseServ;
		this.userServ = userServ;
	}
	@GetMapping("/new")
	public String newCourse(@ModelAttribute("course") Course course, Model model, HttpSession session) {
		model.addAttribute("loggedInUser", userServ.getUser((Long) session.getAttribute("user_id")));
		return "main/CreateCourse.jsp";
	}
	@PostMapping("/process")
	public String createCourse(@Valid @ModelAttribute("course") Course course, BindingResult result) {
		if(result.hasErrors()) {
			return "main/CreateCourse.jsp";
		} else {
			courseServ.create(course);
			return "redirect:/";
		}
	}
	@GetMapping("/{id}")
	public String showCourse(@PathVariable("id") Long id, Model model, HttpSession session) {
		Course course = courseServ.getCourse(id);
		model.addAttribute("loggedInUser", userServ.getUser((Long) session.getAttribute("user_id")));
		model.addAttribute("course", course);
		
		return "main/Course.jsp";
	}
	@GetMapping("/edit/{id}")
	public String editCourse(@PathVariable("id") Long id, Model model, HttpSession session) {
		Course course = courseServ.getCourse(id);
		model.addAttribute("course", course);
		model.addAttribute("loggedInUser", userServ.getUser((Long) session.getAttribute("user_id")));
		return "/main/EditCourse.jsp";
	}
	@PutMapping("/edit/process/{id}")
	public String processEditCourse(@Valid @ModelAttribute("course") Course course, BindingResult result) {
		if(result.hasErrors()) {
			return "/main/EditCourse.jsp";
		}
		courseServ.update(course);
		return "redirect:/";
	}
	@DeleteMapping("/{id}")
	public String processDelete(@PathVariable("id") Long id, Model model) {
		courseServ.deleteById(id);
		return "redirect:/";
	}
}