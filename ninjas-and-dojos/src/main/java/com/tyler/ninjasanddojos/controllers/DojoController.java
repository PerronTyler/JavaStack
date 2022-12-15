package com.tyler.ninjasanddojos.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tyler.ninjasanddojos.models.Dojo;
import com.tyler.ninjasanddojos.services.DojoService;

@Controller
@RequestMapping("/dojos")
public class DojoController {
	private final DojoService dojoServ;
	public DojoController(DojoService dojoServ) {
		this.dojoServ = dojoServ;
		// TODO Auto-generated constructor stub
	}
	@GetMapping("/new")
	public String newDojo(@ModelAttribute("dojo") Dojo dojo, Model model) {
		return "main/newDojo.jsp";
	}
	@PostMapping("/process")
	public String createDojo(@Valid @RequestParam("name") String name, @ModelAttribute("dojo") Dojo dojo, Model model) {
		 dojoServ.create(dojo);
		 return "main/dashboard.jsp";
	}
	@GetMapping("/{dojoId}")
	public String showDojo(@PathVariable("dojoId") Long id, Model model) {
		Dojo dojo = dojoServ.getDojo(id);
		model.addAttribute("dojo", dojo);
		return "main/Dojo.jsp";
	}

}
